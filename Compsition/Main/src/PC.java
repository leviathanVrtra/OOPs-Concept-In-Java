public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("windows 1.2");
    }

    private void drawLogo() {
        monitor.drawPixelAt(1500,1600,"Yellow");
    }
}
