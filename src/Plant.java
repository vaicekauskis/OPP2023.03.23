public class Plant {

    private String title;
    private String titleLatin;
    private boolean annualPerennial;
    private String plantContinent;
    private int heightAdultPlantInMeters;
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
    public void  setTitleitle(void title){

    }
    public String getTitleLatin(){
        return titleLatin;
    }
    public void setTitleLatin(){

    }
    public void  getAnnualPerennial(){
        this.annualPerennial = annualPerennial;
    }
    public void setAnnualPerennial(){

    }
    public String getPlantContinent(){
        return plantContinent;
    }
    public void setPlantContinent(){

    }
    public int getHeightAdultPlantInMeters(){
        return heightAdultPlantInMeters;
    }
    public void getedibleInedible(){
        this.edibleInedible = edibleInedible;
    }

    public void setEdibleInedible(){

    }


}
