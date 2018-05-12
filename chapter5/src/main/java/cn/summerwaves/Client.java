package cn.summerwaves;

public class Client {
    private InterFace interFace;

    public void setInterFace(InterFace interFace) {
        this.interFace = interFace;
    }

    public void fuck() {
        interFace.fuck();
    }
}
