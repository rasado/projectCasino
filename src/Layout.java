public class Layout {

    public String name;
    public String description;


    public Layout(String inName, String inDescription) {
        name = inName;
        description = inDescription;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString(){
        String roomString = getName() + getDescription();
        return roomString;
    }

}
