package tn.taktak.GestCommerciale_V1.entity;

// Generated 10 oct. 2015 15:25:00 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * FactureClient generated by hbm2java
 */
@Entity
@Getter
@Setter
public class FactureClient  {

	@Id
	private String cfactureClient;
	private String cclient;
	private String cregimeTva;
	private String soldee;
	private Date dateCreation;
	private Date dateModification;
	private Date datePiece;
	private boolean origineBonCaisse;
	private boolean fodec;
	private BigDecimal tauxFodec;
	private boolean taxeSurTtc;
	private BigDecimal tauxTaxeSurTtc;
	private boolean timbreFiscal;
	private BigDecimal prixTimbreFiscal;
	private String desAdresseClient;
	private String paysClient;
	private String villeClient;
	private String regionClient;
	private String codePostalClient;
	private String observation;
	private BigDecimal tauxTva0;
	private BigDecimal tauxTva1;
	private BigDecimal tauxTva2;
	private BigDecimal tauxTva3;
	private BigDecimal tauxTva4;
	private BigDecimal tauxTva5;
	private BigDecimal tauxTva6;
	private BigDecimal mtHtbrut0;
	private BigDecimal mtHtbrut1;
	private BigDecimal mtHtbrut2;
	private BigDecimal mtHtbrut3;
	private BigDecimal mtHtbrut4;
	private BigDecimal mtHtbrut5;
	private BigDecimal mtHtbrut6;
	private BigDecimal baseTva0;
	private BigDecimal baseTva1;
	private BigDecimal baseTva2;
	private BigDecimal baseTva3;
	private BigDecimal baseTva4;
	private BigDecimal baseTva5;
	private BigDecimal baseTva6;
	private BigDecimal mtTva0;
	private BigDecimal mtTva1;
	private BigDecimal mtTva2;
	private BigDecimal mtTva3;
	private BigDecimal mtTva4;
	private BigDecimal mtTva5;
	private BigDecimal mtTva6;
	private BigDecimal mtTtc0;
	private BigDecimal mtTtc1;
	private BigDecimal mtTtc2;
	private BigDecimal mtTtc3;
	private BigDecimal mtTtc4;
	private BigDecimal mtTtc5;
	private BigDecimal mtTtc6;
	private BigDecimal mtTotalVente;
	private BigDecimal mtTotalRemises;
	private BigDecimal mtTotalHt;
	private BigDecimal mtTotalTva;
	private BigDecimal mtTotalFodec;
	private BigDecimal mtTotalTaxeSurTtc;
	private BigDecimal mtTotalTtc;
	private BigDecimal mtNonSoldee;
	private BigDecimal mtSoldee;
	private BigDecimal mtTotalMarge;
	private BigDecimal acompte;
	private BigDecimal netApayer;
	private BigDecimal poidsTotalBrut;
	private BigDecimal poidsTotalNet;
	

	public FactureClient() {
	}

	public FactureClient(String cfactureClient, String client,
			String regimeTva, String soldee, Date dateCreation,
			Date dateModification, Date datePiece, boolean origineBonCaisse,
			boolean fodec, BigDecimal tauxFodec, boolean taxeSurTtc,
			BigDecimal tauxTaxeSurTtc, boolean timbreFiscal,
			BigDecimal prixTimbreFiscal, BigDecimal mtHtbrut0,
			BigDecimal mtHtbrut1, BigDecimal mtHtbrut2, BigDecimal mtHtbrut3,
			BigDecimal mtHtbrut4, BigDecimal mtHtbrut5, BigDecimal mtHtbrut6,
			BigDecimal baseTva0, BigDecimal baseTva1, BigDecimal baseTva2,
			BigDecimal baseTva3, BigDecimal baseTva4, BigDecimal baseTva5,
			BigDecimal baseTva6, BigDecimal mtTva0, BigDecimal mtTva1,
			BigDecimal mtTva2, BigDecimal mtTva3, BigDecimal mtTva4,
			BigDecimal mtTva5, BigDecimal mtTva6, BigDecimal mtTtc0,
			BigDecimal mtTtc1, BigDecimal mtTtc2, BigDecimal mtTtc3,
			BigDecimal mtTtc4, BigDecimal mtTtc5, BigDecimal mtTtc6,
			BigDecimal mtTotalVente, BigDecimal mtTotalRemises,
			BigDecimal mtTotalHt, BigDecimal mtTotalTva,
			BigDecimal mtTotalFodec, BigDecimal mtTotalTaxeSurTtc,
			BigDecimal mtTotalTtc, BigDecimal mtNonSoldee, BigDecimal mtSoldee,
			BigDecimal mtTotalMarge, BigDecimal acompte, BigDecimal netApayer,
			BigDecimal poidsTotalBrut, BigDecimal poidsTotalNet) {
		this.cfactureClient = cfactureClient;
		this.cclient = client;
		this.cregimeTva = regimeTva;
		this.soldee = soldee;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.datePiece = datePiece;
		this.origineBonCaisse = origineBonCaisse;
		this.fodec = fodec;
		this.tauxFodec = tauxFodec;
		this.taxeSurTtc = taxeSurTtc;
		this.tauxTaxeSurTtc = tauxTaxeSurTtc;
		this.timbreFiscal = timbreFiscal;
		this.prixTimbreFiscal = prixTimbreFiscal;
		this.mtHtbrut0 = mtHtbrut0;
		this.mtHtbrut1 = mtHtbrut1;
		this.mtHtbrut2 = mtHtbrut2;
		this.mtHtbrut3 = mtHtbrut3;
		this.mtHtbrut4 = mtHtbrut4;
		this.mtHtbrut5 = mtHtbrut5;
		this.mtHtbrut6 = mtHtbrut6;
		this.baseTva0 = baseTva0;
		this.baseTva1 = baseTva1;
		this.baseTva2 = baseTva2;
		this.baseTva3 = baseTva3;
		this.baseTva4 = baseTva4;
		this.baseTva5 = baseTva5;
		this.baseTva6 = baseTva6;
		this.mtTva0 = mtTva0;
		this.mtTva1 = mtTva1;
		this.mtTva2 = mtTva2;
		this.mtTva3 = mtTva3;
		this.mtTva4 = mtTva4;
		this.mtTva5 = mtTva5;
		this.mtTva6 = mtTva6;
		this.mtTtc0 = mtTtc0;
		this.mtTtc1 = mtTtc1;
		this.mtTtc2 = mtTtc2;
		this.mtTtc3 = mtTtc3;
		this.mtTtc4 = mtTtc4;
		this.mtTtc5 = mtTtc5;
		this.mtTtc6 = mtTtc6;
		this.mtTotalVente = mtTotalVente;
		this.mtTotalRemises = mtTotalRemises;
		this.mtTotalHt = mtTotalHt;
		this.mtTotalTva = mtTotalTva;
		this.mtTotalFodec = mtTotalFodec;
		this.mtTotalTaxeSurTtc = mtTotalTaxeSurTtc;
		this.mtTotalTtc = mtTotalTtc;
		this.mtNonSoldee = mtNonSoldee;
		this.mtSoldee = mtSoldee;
		this.mtTotalMarge = mtTotalMarge;
		this.acompte = acompte;
		this.netApayer = netApayer;
		this.poidsTotalBrut = poidsTotalBrut;
		this.poidsTotalNet = poidsTotalNet;
	}

	public FactureClient(String cfactureClient, String client,
			String regimeTva, String soldee, Date dateCreation,
			Date dateModification, Date datePiece, boolean origineBonCaisse,
			boolean fodec, BigDecimal tauxFodec, boolean taxeSurTtc,
			BigDecimal tauxTaxeSurTtc, boolean timbreFiscal,
			BigDecimal prixTimbreFiscal, String desAdresseClient,
			String paysClient, String villeClient, String regionClient,
			String codePostalClient, String observation, BigDecimal tauxTva0,
			BigDecimal tauxTva1, BigDecimal tauxTva2, BigDecimal tauxTva3,
			BigDecimal tauxTva4, BigDecimal tauxTva5, BigDecimal tauxTva6,
			BigDecimal mtHtbrut0, BigDecimal mtHtbrut1, BigDecimal mtHtbrut2,
			BigDecimal mtHtbrut3, BigDecimal mtHtbrut4, BigDecimal mtHtbrut5,
			BigDecimal mtHtbrut6, BigDecimal baseTva0, BigDecimal baseTva1,
			BigDecimal baseTva2, BigDecimal baseTva3, BigDecimal baseTva4,
			BigDecimal baseTva5, BigDecimal baseTva6, BigDecimal mtTva0,
			BigDecimal mtTva1, BigDecimal mtTva2, BigDecimal mtTva3,
			BigDecimal mtTva4, BigDecimal mtTva5, BigDecimal mtTva6,
			BigDecimal mtTtc0, BigDecimal mtTtc1, BigDecimal mtTtc2,
			BigDecimal mtTtc3, BigDecimal mtTtc4, BigDecimal mtTtc5,
			BigDecimal mtTtc6, BigDecimal mtTotalVente,
			BigDecimal mtTotalRemises, BigDecimal mtTotalHt,
			BigDecimal mtTotalTva, BigDecimal mtTotalFodec,
			BigDecimal mtTotalTaxeSurTtc, BigDecimal mtTotalTtc,
			BigDecimal mtNonSoldee, BigDecimal mtSoldee,
			BigDecimal mtTotalMarge, BigDecimal acompte, BigDecimal netApayer,
			BigDecimal poidsTotalBrut, BigDecimal poidsTotalNet) {
		this.cfactureClient = cfactureClient;
		this.cclient = client;
		this.cregimeTva = regimeTva;
		this.soldee = soldee;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.datePiece = datePiece;
		this.origineBonCaisse = origineBonCaisse;
		this.fodec = fodec;
		this.tauxFodec = tauxFodec;
		this.taxeSurTtc = taxeSurTtc;
		this.tauxTaxeSurTtc = tauxTaxeSurTtc;
		this.timbreFiscal = timbreFiscal;
		this.prixTimbreFiscal = prixTimbreFiscal;
		this.desAdresseClient = desAdresseClient;
		this.paysClient = paysClient;
		this.villeClient = villeClient;
		this.regionClient = regionClient;
		this.codePostalClient = codePostalClient;
		this.observation = observation;
		this.tauxTva0 = tauxTva0;
		this.tauxTva1 = tauxTva1;
		this.tauxTva2 = tauxTva2;
		this.tauxTva3 = tauxTva3;
		this.tauxTva4 = tauxTva4;
		this.tauxTva5 = tauxTva5;
		this.tauxTva6 = tauxTva6;
		this.mtHtbrut0 = mtHtbrut0;
		this.mtHtbrut1 = mtHtbrut1;
		this.mtHtbrut2 = mtHtbrut2;
		this.mtHtbrut3 = mtHtbrut3;
		this.mtHtbrut4 = mtHtbrut4;
		this.mtHtbrut5 = mtHtbrut5;
		this.mtHtbrut6 = mtHtbrut6;
		this.baseTva0 = baseTva0;
		this.baseTva1 = baseTva1;
		this.baseTva2 = baseTva2;
		this.baseTva3 = baseTva3;
		this.baseTva4 = baseTva4;
		this.baseTva5 = baseTva5;
		this.baseTva6 = baseTva6;
		this.mtTva0 = mtTva0;
		this.mtTva1 = mtTva1;
		this.mtTva2 = mtTva2;
		this.mtTva3 = mtTva3;
		this.mtTva4 = mtTva4;
		this.mtTva5 = mtTva5;
		this.mtTva6 = mtTva6;
		this.mtTtc0 = mtTtc0;
		this.mtTtc1 = mtTtc1;
		this.mtTtc2 = mtTtc2;
		this.mtTtc3 = mtTtc3;
		this.mtTtc4 = mtTtc4;
		this.mtTtc5 = mtTtc5;
		this.mtTtc6 = mtTtc6;
		this.mtTotalVente = mtTotalVente;
		this.mtTotalRemises = mtTotalRemises;
		this.mtTotalHt = mtTotalHt;
		this.mtTotalTva = mtTotalTva;
		this.mtTotalFodec = mtTotalFodec;
		this.mtTotalTaxeSurTtc = mtTotalTaxeSurTtc;
		this.mtTotalTtc = mtTotalTtc;
		this.mtNonSoldee = mtNonSoldee;
		this.mtSoldee = mtSoldee;
		this.mtTotalMarge = mtTotalMarge;
		this.acompte = acompte;
		this.netApayer = netApayer;
		this.poidsTotalBrut = poidsTotalBrut;
		this.poidsTotalNet = poidsTotalNet;
		
	}

}
