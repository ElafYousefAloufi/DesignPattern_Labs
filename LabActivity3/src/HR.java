/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #03
 */

import java.io.File;
import java.sql.Date;

public class HR extends Company {

    File curriculum_vitaes;
    Date hire_dates;
    String interviewers;
    String interviewees;

    Database x = Database.getInstance();
      
    public HR() {

    }

    public File getCurriculum_vitaes() {
        return curriculum_vitaes;
    }

    public Date getHire_dates() {
        return hire_dates;
    }

    public String getInterviewers() {
        return interviewers;
    }

    public String getInterviewees() {
        return interviewees;
    }

    public Database getX() {
        return x;
    }

    public void setCurriculum_vitaes(File curriculum_vitaes) {
        this.curriculum_vitaes = curriculum_vitaes;
    }

    public void setHire_dates(Date hire_dates) {
        this.hire_dates = hire_dates;
    }

    public void setInterviewers(String interviewers) {
        this.interviewers = interviewers;
    }

    public void setInterviewees(String interviewees) {
        this.interviewees = interviewees;
    }

    public void setX(Database x) {
        this.x = x;
    }

}
