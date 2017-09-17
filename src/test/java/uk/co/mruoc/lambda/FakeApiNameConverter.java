package uk.co.mruoc.lambda;

public class FakeApiNameConverter implements ApiNameConverter {

    private String id;
    private String stage;
    private String name;

    @Override
    public String toId(String stage, String name) {
        this.stage = stage;
        return toId(name);
    }

    @Override
    public String toId(String name) {
        this.name = name;
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastStage() {
        return stage;
    }

    public String getLastName() {
        return name;
    }

}
