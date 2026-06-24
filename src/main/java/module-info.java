module org.syntaxerror.kms_narkotika {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.syntaxerror.kms_narkotika to javafx.fxml;
    exports org.syntaxerror.kms_narkotika;
}