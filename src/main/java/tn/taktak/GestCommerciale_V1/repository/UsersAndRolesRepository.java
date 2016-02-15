package tn.taktak.GestCommerciale_V1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tn.taktak.GestCommerciale_V1.entity.Representant;
import tn.taktak.GestCommerciale_V1.entity.Role;
import tn.taktak.GestCommerciale_V1.entity.UsersAndRoles;


public interface UsersAndRolesRepository  extends JpaRepository<UsersAndRoles, Integer> {

	@Query("select f from Role f, UsersAndRoles g "
			+ " where f.id=g.role_id "
			+ " AND g.user_id=?1 ")
	public List<Role> listOfRoleByUser(String t);
	
	@Query("select f from Role f where f.id in (select g.role_id from UsersAndRoles g where g.user_id=?1)")
	public List<Role> listOfRoleByUser_V1(String t);
	
	
	@Query("select f from Representant f, UsersAndRoles g "
			+ "where f.crepresentant=g.user_id "
			+ "and g.role_id=?1")
	public List<Representant> listOfUserByRole(int t);
}
