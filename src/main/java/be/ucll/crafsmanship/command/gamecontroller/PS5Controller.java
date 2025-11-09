package be.ucll.crafsmanship.command.gamecontroller;

public class PS5Controller {
    private Command crossButton;
    private Command triangleButton;
    private Command squareButton;
    private Command circleButton;

    public void setCrossButton(Command command) {
        this.crossButton = command;
    }

    public void setTriangleButton(Command command) {
        this.triangleButton = command;
    }

    public void setSquareButton(Command command) {
        this.squareButton = command;
    }

    public void setCircleButton(Command command) {
        this.circleButton = command;
    }

    public void pressCross() {
        if (crossButton != null) {
            crossButton.execute();
        }
    }

    public void pressTriangle() {
        if (triangleButton != null) {
            triangleButton.execute();
        }
    }

    public void pressSquare() {
        if (squareButton != null) {
            squareButton.execute();
        }
    }

    public void pressCircle() {
        if (circleButton != null) {
            circleButton.execute();
        }
    }
}
