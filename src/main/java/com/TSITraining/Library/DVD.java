package com.TSITraining.Library;

public class DVD extends com.TSITraining.Library.Multimedia {


    /////////////////////////Attributes\\\\\\\\\\\\\\\\\\\\
    private String title;
    private String director;
    private int year;



    ///////////////////////////Constructor\\\\\\\\\\\\\\\\\

    public DVD(String title, String director, int date) {
        this.title = title;
        this.director = director;
        this.year = year;
    }










    /////////////////////////Method\\\\\\\\\\\\\\\\\\\\\\\\



    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void borrowTime(int days) {
        //Attributes can not be implemented into this section but code needs to be called
    }

    @Override
    public void education(String knowledge) {
        //Attributes can not be implemented into this section but code needs to be called
    }

    @Override
    public void engagement() {
        //Attributes can not be implemented into this section but code needs to be called
    }
}
