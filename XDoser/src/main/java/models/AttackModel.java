package models;

public class AttackModel {
    private String targetURL;
    private String method;
    private int numberOfThreads;
    private int numberofMinits;
    private String postBody;
    private String bodyType;

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getTargetURL() {
        return targetURL;
    }

    public void setTargetURL(String targetURL) {
        this.targetURL = targetURL;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getNumberOfThreads() {
        return numberOfThreads;
    }

    public void setNumberOfThreads(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    public int getNumberofMinits() {
        return numberofMinits;
    }

    public void setNumberofMinits(int numberofMinits) {
        this.numberofMinits = numberofMinits;
    }

    @Override
    public String toString() {
        return "AttackModel{" +
                "targetURL='" + targetURL + '\'' +
                ", method='" + method + '\'' +
                ", numberOfThreads=" + numberOfThreads +
                ", numberofMinits=" + numberofMinits +
                ", postBody='" + postBody + '\'' +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}

