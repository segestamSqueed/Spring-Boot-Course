package springbootcourse.albin.squeed.web.models;

public enum Position
{
    HOUSEKEEPING, FRONT_DESK,SECURITY,CONCIERGE;

    @Override
    public String toString() {
        return switch(this) {
            case CONCIERGE -> "Concierge";
            case SECURITY -> "Security";
            case FRONT_DESK -> "Front desk";
            case HOUSEKEEPING -> "Housekeeping";
        };
    }
}
