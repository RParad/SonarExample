package com.TSITraining.Library;


public abstract class LibraryItems {

    /////////////////////////////Attributes\\\\\\\\\\\\\\\\\\\\
    private String title;
    private int date;







    ////////////////////////////Constructor\\\\\\\\\\\\\\\\\\\\







    //////////////////////////////Methods\\\\\\\\\\\\\\\\\\\\\\\\
    //Methods of action and identifiers

    public void cognition(String stimulant) {
        System.out.println("I increase cognitive function");
    }
    public void storage(String format) {
        System.out.println("I store information as data");
    }

    public abstract void borrowTime(int days);

    public abstract void education (String knowledge);

    public abstract void engagement(); //Not sure if this is appropriate double cheek
    //how the content/media is engaged with??


    //Getters
    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }


    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
