public class Plant {

    private String title;
    private String titleLatin;
    private boolean annualPerennial;
    private String plantContinent;
    private double heightAdultPlantInMeters;
    private boolean edibleInedible;

    public Plant() {
    }

    public Plant(String title, String titleLatin, boolean annualPerennial, String plantcontinent,
                 int heightAdultPlantInMeters,boolean edibleInedible) {
        this.title = title;
        this.titleLatin = titleLatin;
        this.annualPerennial = annualPerennial;
        this.plantContinent = plantcontinent;
        this.heightAdultPlantInMeters = heightAdultPlantInMeters;
        this.edibleInedible = edibleInedible;

    }

    public String getTitle() {
        return title;
    }
    public void  setTitle(String title){
        this.title = title;

    }
    public String getTitleLatin(){
        return titleLatin;
    }
    public void setTitleLatin(String titleLatin){
        this.titleLatin = titleLatin;

    }
    public boolean  getAnnualPerennial(){
        return annualPerennial;
    }
    public void setAnnualPerennial(boolean annualPerennial){
        this.annualPerennial = annualPerennial;

    }
    public String getPlantContinent(){
        return plantContinent;
    }
    public void setPlantContinent(String plantContinent){
        this.plantContinent =plantContinent ;

    }
    public double getHeightAdultPlantInMeters(){
        return heightAdultPlantInMeters;
    }
    public void  setHeightAdultPlantInMeters(double heightAdultPlantInMeters){
        this.heightAdultPlantInMeters = heightAdultPlantInMeters;

    }
    public boolean getedibleInedible(){
        return edibleInedible;
    }

    public void setEdibleInedible(boolean edibleInedible){
        this.edibleInedible = edibleInedible;

    }


    @Override
    public String toString() {

       return  " Augalo pavadinimas: " + title +  " Pavadinimas Lotyniškai  :" + titleLatin + " Vienmetis :" +
               (annualPerennial? " Taip " : " Ne ") + " Labiausiai paplitęs :" + plantContinent + " Suaugusio augalo aukštis " +
               (heightAdultPlantInMeters == (int) heightAdultPlantInMeters ? ((int) heightAdultPlantInMeters + "") :
                       heightAdultPlantInMeters )+" Metrais " + " Ar valgomas :" + (edibleInedible? " Taip " : " Ne " );
    }
}
