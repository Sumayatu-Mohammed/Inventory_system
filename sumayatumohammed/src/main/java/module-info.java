module com.example.sumayatumohammed {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.sumayatumohammed to javafx.fxml;
    exports com.example.sumayatumohammed;
}