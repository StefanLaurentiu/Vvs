package http;

// foloseste extensia fisierului pentru a mapa tipul de continut disponibil pe baza tipurilor media obisnuite

public enum ContentType {
    CSS("CSS"), //
    GIF("GIF"), //
    HTM("HTM"), //
    HTML("HTML"), //
    ICO("ICO"), //
    JPG("JPG"), //
    JPEG("JPEG"), //
    PNG("PNG"), //
    TXT("TXT"), //
    XML("XML"); //

    private final String extension;

    ContentType(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        switch (this) {
            case CSS:
                return "Content-Type: text/css";
            case GIF:
            case ICO:
                return "Content-Type: image/gif";
            case HTM:
            case HTML:
                return "Content-Type: text/html";
            case JPG:
            case JPEG:
                return "Content-Type: image/jpeg";
            case PNG:
                return "Content-Type: image/png";
            case TXT:
                return "Content-type: text/plain";
            case XML:
                return "Content-type: text/xml";
            default:
                return null;
        }
    }
}
