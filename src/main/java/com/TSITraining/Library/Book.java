package com.TSITraining.Library;

public class Book extends com.TSITraining.Library.Literature implements Borrow{
    /////////////////////////Attributes\\\\\\\\\\\\\\\\\\\\
    private String chapters;
    private String author;
    private String coverType;
    private String writingStyle;
    public String title;


    ///////////////////////////Constructor\\\\\\\\\\\\\\\\\

    public Book(String title,String chapters, String author, String coverType, String writingStyle) {
        this.title= title;
        this.chapters = chapters;
        this.author = author;
        this.coverType = coverType;
        this.writingStyle = writingStyle;

    }

    public Book(String author, String coverType, String writingStyle) {
        this.author = author;
        this.coverType = coverType;
        this.writingStyle = writingStyle;
    }
    public Book(String author, String coverType) {
        this.author = author;
        this.coverType = coverType;
    }




    /////////////////////////Method\\\\\\\\\\\\\\\\\\\\\\\\



    public void education(String knowledge) {
        System.out.println("Reading increases reading age!");
    }

    public void borrowTime(int days) {
        System.out.println("Book can be borrowed for" + days + "days");
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getWritingStyle() {
        return writingStyle;
    }

    public void setWritingStyle(String writingStyle) {
        this.writingStyle = writingStyle;
    }

    @Override
    public void loanDuration() {

    }

    @Override
    public void qualityCheck() {

    }

    @Override
    public void returns() {

    }
}

