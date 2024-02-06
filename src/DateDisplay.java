public class DateDisplay {

    int dateDisplay;
    int monthDisplay;
    int yearDisplay;
    String dateFormat;
    public DateDisplay(int dateDisplay, int monthDisplay, int yearDisplay){
        if (dateDisplay < 0){
            dateDisplay = 1;
        }
        if (monthDisplay < 0){
            monthDisplay = 1;
        }
        if (yearDisplay < 0){
            yearDisplay = 1900;
        }
        this.dateDisplay = dateDisplay;
        this.monthDisplay = monthDisplay ;
        this.yearDisplay = yearDisplay;
    }
    public int getDateDisplay() {
        return dateDisplay;
    }
    public void setDateDisplay(int dateDisplay) {
        this.dateDisplay = dateDisplay;
    }

    public int getMonthDisplay() {
        return monthDisplay;
    }
    public void setMonthDisplay(int monthDisplay) {
        this.monthDisplay = monthDisplay;
    }
    public int getYearDisplay() {
        return yearDisplay;
    }
    public void setYearDisplay(int yearDisplay) {
        this.yearDisplay = yearDisplay;
    }

    public String dateToDisplay(int dateDisplay, int monthDisplay, int yearDisplay){
        return Integer.toString(dateDisplay)+"/"+Integer.toString(monthDisplay)+"/"+Integer.toString(yearDisplay);
    }
}
