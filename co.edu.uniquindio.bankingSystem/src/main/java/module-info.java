module co.edu.uniquindio.bankingsystem.bankingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.bankingsystem.bankingsystem to javafx.fxml;
    exports co.edu.uniquindio.bankingsystem.bankingsystem;

    opens co.edu.uniquindio.bankingsystem.bankingsystem.viewController;
    exports co.edu.uniquindio.bankingsystem.bankingsystem.viewController;


}