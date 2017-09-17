package uk.co.mruoc.lambda;

public interface ApiNameConverter {

    String toId(String stage, String name);

    String toId(String name);

}
