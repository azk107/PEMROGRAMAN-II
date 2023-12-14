package com.example.praktikum6;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> table = new TableView<>();

        TableColumn<Mahasiswa, String> nimColoum = new TableColumn<>("NIM");
        nimColoum.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> namaColoum = new TableColumn<>("Nama");
        namaColoum.setCellValueFactory(new PropertyValueFactory<>("nama"));

        table.getColumns().addAll(nimColoum, namaColoum);

        ObservableList<Mahasiswa> data = FXCollections.observableArrayList(
                new Mahasiswa(1, "Azka Amalia", "2210817220009"),
                new Mahasiswa(2, "Aldira Putri Sholeha", "2210817220024"),
                new Mahasiswa(3, "Nor Aina Eva Yanti", "2210817120004"),
                new Mahasiswa(4, "Nur Alifya Zhafira Putri", "2210817122222"),
                new Mahasiswa(5, "Nida'an", "2210817133333"),
                new Mahasiswa(6, "Rona Nabila", "2210817144444"),
                new Mahasiswa(7, "Nursyifa", "2210817155555"),
                new Mahasiswa(8, "M. Luthfianoor Ryfanie", "2210817166666"),
                new Mahasiswa(9, "Rita Safarina", "2210817177777"),
                new Mahasiswa(10, "Noorthaibah", "2210817188888")
        );
        table.setItems(data);
        Scene scene = new Scene(table, 300, 275);
        primaryStage.setTitle("Daftar Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

