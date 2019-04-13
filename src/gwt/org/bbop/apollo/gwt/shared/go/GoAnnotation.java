package org.bbop.apollo.gwt.shared.go;


public class GoAnnotation {


    GoGene goGene ; // I think tis is the gene it refers to?
    GoTerm goTerm;
    EvidenceCode evidenceCode;
    Qualifier qualifier ;
    Reference reference;
    WithOrFrom withOrFrom;

    public GoGene getGoGene() {
        return goGene;
    }

    public void setGoGene(GoGene goGene) {
        this.goGene = goGene;
    }

    public GoTerm getGoTerm() {
        return goTerm;
    }

    public void setGoTerm(GoTerm goTerm) {
        this.goTerm = goTerm;
    }

    public EvidenceCode getEvidenceCode() {
        return evidenceCode;
    }

    public void setEvidenceCode(EvidenceCode evidenceCode) {
        this.evidenceCode = evidenceCode;
    }

    public Qualifier getQualifier() {
        return qualifier;
    }

    public void setQualifier(Qualifier qualifier) {
        this.qualifier = qualifier;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public WithOrFrom getWithOrFrom() {
        return withOrFrom;
    }

    public void setWithOrFrom(WithOrFrom withOrFrom) {
        this.withOrFrom = withOrFrom;
    }

}