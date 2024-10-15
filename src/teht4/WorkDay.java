package teht4;

public enum WorkDay {
    MONDAY("9-17"),
    TUESDAY("9-17"),
    WEDNESDAY("9-17"),
    THURSDAY("9-17"),
    FRIDAY("9-17"),
    SATURDAY("10-13"){
        @Override
        public String getLocationOfWork() {
            return "Home";
        }
    },
    SUNDAY("OFF"){
        @Override
        public String getLocationOfWork() {
            return "None of ur business";
        }

    };

    private final String hoursOfWork;

    // Private constructor
    WorkDay(String hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public String getHoursOfWork(){
        return hoursOfWork;
    }
    public String getLocationOfWork(){
        return "Office";
    }

}

