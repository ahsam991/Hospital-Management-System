package Classes;

public class Medicine {
    protected String medID, medName, medAuthor, company;

    public Medicine(String medID) {
        this.medID = medID;
    }

    public Medicine(String MedID, String medName, String medAuthor, String company) {
        this.medID = medID;
        this.medName = medName;
        this.medAuthor = medAuthor;
        this.company = company;
    }

    /* ============= Getters and Setters ============= */

    public void setMedID(String MedID) {
        this.medID = medID;
    }

    public void setmedName(String medName) {
        this.medName = medName;
    }

    public void setCompany(String medAuthor) {
        this.medAuthor = medAuthor;
    }

    public void setmedexpire(String company) {
        this.company = company;
    }

    public String getmedID() {
        return medID;
    }

    public String getmedName() {
        return medName;
    }

    public String getmedAuthor() {
        return medAuthor;
    }

    public String getmedEdition() {
        return company;
    }
}