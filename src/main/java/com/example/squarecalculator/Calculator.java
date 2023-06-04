package com.example.squarecalculator;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public final class Calculator extends Application {
     Stage stage = new Stage();

    @Override
    public void start(Stage stage) {
        setUpStage();
        createStartPage();
    }

    public void setUpStage() {
        stage.setResizable(false);
        stage.setTitle("Square & Volume Calculator");
        stage.setWidth(1000);
        stage.setHeight(1000);
    }

    public void createStartPage() {
        Pane startCont = new Pane();
        Button squareBtn = new Button("Calculate square");
        Button volumeBtn = new Button("Calculate volume");
        Button exitBtn = new Button("Exit");
        squareBtn.setPrefSize(200, 200);
        volumeBtn.setPrefSize(200, 200);
        squareBtn.setTranslateX(200);
        squareBtn.setTranslateY(500);
        volumeBtn.setTranslateX(600);
        volumeBtn.setTranslateY(500);
        exitBtn.setPrefSize(200, 200);
        exitBtn.setTranslateX(400);
        exitBtn.setTranslateY(800);
        volumeBtn.setOnMouseClicked(event -> createVolumeMenu());
        squareBtn.setOnMouseClicked(event -> createSquareMenu());
        exitBtn.setOnMouseClicked(event -> stop());
        startCont.getChildren().addAll(volumeBtn, squareBtn, exitBtn);
        stage.setScene(new Scene(startCont));
        stage.show();

    }

    public void createSquareMenu(){
        Button crBtn = new Button("Circle");
        Button pgBtn = new Button("Parallelogram");
        Button recBtn = new Button("Rectangle");
        Button rhBtn = new Button("Rhomb");
        Button sqBtn = new Button("Square");
        Button trBtn = new Button("Triangle");
        Button polBtn = new Button("Polygon");
        Button returnBtn = new Button("Go back");
        crBtn.setPrefSize(100, 100);
        pgBtn.setPrefSize(100, 100);
        recBtn.setPrefSize(100, 100);
        rhBtn.setPrefSize(100, 100);
        sqBtn.setPrefSize(100, 100);
        trBtn.setPrefSize(100, 100);
        polBtn.setPrefSize(100, 100);
        returnBtn.setPrefSize(100, 100);
        TilePane tilePane = new TilePane();
        tilePane.setAlignment(Pos.CENTER);
        tilePane.setOrientation(Orientation.HORIZONTAL);
        tilePane.setPrefColumns(3);
        tilePane.setPrefRows(3);
        crBtn.setOnMouseClicked(event -> requestCircle());
        pgBtn.setOnMouseClicked(event -> requestParallelogram());
        recBtn.setOnMouseClicked(event -> requestRectangle());
        rhBtn.setOnMouseClicked(event -> requestRhomb());
        sqBtn.setOnMouseClicked(event -> requestSquare());
        trBtn.setOnMouseClicked(event -> requestTriangle());
        polBtn.setOnMouseClicked(event -> requestPolygon());
        returnBtn.setOnMouseClicked(event -> createStartPage());

        tilePane.getChildren().addAll(crBtn, pgBtn, rhBtn, recBtn, sqBtn, trBtn, polBtn, returnBtn);
        stage.setScene(new Scene(tilePane));


    }

    public void createVolumeMenu(){
        Button cnBtn = new Button("Cone");
        Button cbBtn = new Button("Cube");
        Button ccBtn = new Button("Cut cone");
        Button cpBtn = new Button("Cut pyramid");
        Button clBtn = new Button("Cylinder");
        Button ppBtn = new Button("Parallelepiped");
        Button prBtn = new Button("Prism");
        Button pyBtn = new Button("Pyramid");
        Button returnBtn = new Button("Go back");
        cnBtn.setPrefSize(100, 100);
        cbBtn.setPrefSize(100, 100);
        ccBtn.setPrefSize(100, 100);
        cpBtn.setPrefSize(100, 100);
        clBtn.setPrefSize(100, 100);
        ppBtn.setPrefSize(100, 100);
        prBtn.setPrefSize(100, 100);
        pyBtn.setPrefSize(100, 100);
        returnBtn.setPrefSize(100, 100);
        TilePane tilePane = new TilePane();
        tilePane.setAlignment(Pos.CENTER);
        tilePane.setOrientation(Orientation.HORIZONTAL);
        tilePane.setPrefColumns(3);
        tilePane.setPrefRows(3);
        cnBtn.setOnMouseClicked(event -> requestCone());
        cbBtn.setOnMouseClicked(event -> requestCube());
        ccBtn.setOnMouseClicked(event -> requestCutConus());
        cpBtn.setOnMouseClicked(event -> requestCutPyramid());
        clBtn.setOnMouseClicked(event -> requestCylinder());
        ppBtn.setOnMouseClicked(event -> requestParallelepiped());
        prBtn.setOnMouseClicked(event -> requestPrism());
        pyBtn.setOnMouseClicked(event -> requestPyramid());
        returnBtn.setOnMouseClicked(event -> createStartPage());
        tilePane.getChildren().addAll(cnBtn, cbBtn, ccBtn, cpBtn, clBtn, ppBtn, prBtn, pyBtn, returnBtn);
        stage.setScene(new Scene(tilePane));

    }

    public void requestCircle(){
        Pane root = new Pane();
        TextField tf = new TextField();
        tf.setPromptText("Enter r:");
        tf.setTranslateX(500);
        tf.setTranslateY(200);
        root.getChildren().add(tf);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createSquareMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double r = Double.parseDouble(tf.getText());
            Circle circle = new Circle(r);
            double s = circle.getSquare();
            Label res = new Label();
            res.setText(String.valueOf(s));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(500);
            res.setTranslateY(800);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestParallelogram(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter a:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter b:");
        TextField tf3 = new TextField();
        tf3.setPromptText("Enter sin(a^b): ");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        tf3.setTranslateX(500);
        tf3.setTranslateY(600);
        root.getChildren().addAll(tf1, tf2, tf3);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createSquareMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double a =  Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double sin = Double.parseDouble(tf3.getText());
            Parallelogram pg = new Parallelogram(a, b, sin);
            double s = pg.getSquare();
            Label res = new Label();
            res.setText(String.valueOf(s));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestRectangle(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter a:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter b:");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        root.getChildren().addAll(tf1, tf2);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createSquareMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            Rectangle rectangle = new Rectangle(a, b);
            double s = rectangle.getSquare();
            Label res = new Label();
            res.setText(String.valueOf(s));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestRhomb(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter d1:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter d2:");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        root.getChildren().addAll(tf1, tf2);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createSquareMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double d1 = Double.parseDouble(tf1.getText());
            double d2 = Double.parseDouble(tf2.getText());
            Rhomb rhomb = new Rhomb(d1, d2);
            double s = rhomb.getSquare();
            Label res = new Label();
            res.setText(String.valueOf(s));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestSquare(){
        Pane root = new Pane();
        TextField tf = new TextField();
        tf.setPromptText("Enter a: ");
        tf.setTranslateX(500);
        tf.setTranslateY(200);
        root.getChildren().add(tf);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createSquareMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double a = Double.parseDouble(tf.getText());
            Square square = new Square(a);
            double s = square.getSquare();
            Label res = new Label();
            res.setText(String.valueOf(s));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestTriangle(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter a:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter b:");
        TextField tf3 = new TextField();
        tf3.setPromptText("Enter c: ");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        tf3.setTranslateX(500);
        tf3.setTranslateY(600);
        root.getChildren().addAll(tf1, tf2, tf3);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createSquareMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double c = Double.parseDouble(tf3.getText());
            Triangle triangle = new Triangle(a, b, c);
            double s = triangle.getSquare();
            Label res = new Label();
            res.setText(String.valueOf(s));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));

    }

    public void requestPolygon(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter n:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter a:");
        TextField tf3 = new TextField();
        tf3.setPromptText("Enter r: ");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        tf3.setTranslateX(500);
        tf3.setTranslateY(600);
        root.getChildren().addAll(tf1, tf2, tf3);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createSquareMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            int n = Integer.parseInt(tf1.getText());
            double a = Double.parseDouble(tf2.getText());
            double r = Double.parseDouble(tf3.getText());
            Polygon polygon = new Polygon(n, a, r);
            double s = polygon.getSquare();
            Label res = new Label();
            res.setText(String.valueOf(s));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestCone(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter r:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter h:");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        root.getChildren().addAll(tf1, tf2);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createVolumeMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double r = Double.parseDouble(tf1.getText());
            double h = Double.parseDouble(tf2.getText());
            Cone cone = new Cone(r, h);
            double v = cone.getVolume();
            Label res = new Label();
            res.setText(String.valueOf(v));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestCube(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter a:");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        root.getChildren().addAll(tf1);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createVolumeMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double a = Double.parseDouble(tf1.getText());
            Cube cube = new Cube(a);
            double v = cube.getVolume();
            Label res = new Label();
            res.setText(String.valueOf(v));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));

    }

    public void requestCutConus(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter r1:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter r2:");
        TextField tf3 = new TextField();
        tf3.setPromptText("Enter h: ");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        tf3.setTranslateX(500);
        tf3.setTranslateY(600);
        root.getChildren().addAll(tf1, tf2, tf3);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createVolumeMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double r1 = Double.parseDouble(tf1.getText());
            double r2 = Double.parseDouble(tf2.getText());
            double h = Double.parseDouble(tf3.getText());
            CutConus cc = new CutConus(r1, r2, h);
            double v = cc.getVolume();
            Label res = new Label();
            res.setText(String.valueOf(v));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestCutPyramid(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter s1:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter s2:");
        TextField tf3 = new TextField();
        tf3.setPromptText("Enter h: ");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        tf3.setTranslateX(500);
        tf3.setTranslateY(600);
        root.getChildren().addAll(tf1, tf2);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createVolumeMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double s1 = Double.parseDouble(tf1.getText());
            double s2 = Double.parseDouble(tf2.getText());
            double h =  Double.parseDouble(tf3.getText());
            CutPyramid cp = new CutPyramid(s1, s2, h);
            double v = cp.getVolume();
            Label res = new Label();
            res.setText(String.valueOf(v));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestCylinder(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter r:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter h:");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        root.getChildren().addAll(tf1, tf2);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createVolumeMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double r = Double.parseDouble(tf1.getText());
            double h = Double.parseDouble(tf2.getText());
            Cylinder cylinder = new Cylinder(r, h);
            double v = cylinder.getVolume();
            Label res = new Label();
            res.setText(String.valueOf(v));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestParallelepiped(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter a:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter b:");
        TextField tf3 = new TextField();
        tf3.setPromptText("Enter c: ");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        tf3.setTranslateX(500);
        tf3.setTranslateY(600);
        root.getChildren().addAll(tf1, tf2, tf3);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createVolumeMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double c = Double.parseDouble(tf3.getText());
            Parallelepiped pp = new Parallelepiped(a, b, c);
            double v = pp.getVolume();
            Label res = new Label();
            res.setText(String.valueOf(v));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestPyramid(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter s:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter h:");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        root.getChildren().addAll(tf1, tf2);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createVolumeMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double s = Double.parseDouble(tf1.getText());
            double h = Double.parseDouble(tf2.getText());
            Pyramid pyramid = new Pyramid(s, h);
            double v = pyramid.getVolume();
            Label res = new Label();
            res.setText(String.valueOf(v));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    public void requestPrism(){
        Pane root = new Pane();
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter s:");
        TextField tf2 = new TextField();
        tf2.setPromptText("Enter h:");
        tf1.setTranslateX(500);
        tf1.setTranslateY(200);
        tf2.setTranslateX(500);
        tf2.setTranslateY(400);
        root.getChildren().addAll(tf1, tf2);
        Button calculateBtn = new Button("Calculate");
        Button returnBtn = new Button("Go back");
        returnBtn.setPrefSize(100, 100);
        returnBtn.setTranslateX(400);
        returnBtn.setTranslateY(900);
        returnBtn.setOnMouseClicked(event -> createVolumeMenu());
        calculateBtn.setPrefSize(100, 100);
        calculateBtn.setTranslateX(400);
        calculateBtn.setTranslateY(700);
        calculateBtn.setOnMouseClicked(event -> {
            double s = Double.parseDouble(tf1.getText());
            double h = Double.parseDouble(tf2.getText());
            Prism prism = new Prism(s, h);
            double v = prism.getVolume();
            Label res = new Label();
            res.setText(String.valueOf(v));
            res.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
            res.setAlignment(Pos.BOTTOM_CENTER);
            res.setTranslateX(700);
            res.setTranslateY(100);
            root.getChildren().add(res);
        });
        root.getChildren().addAll(calculateBtn, returnBtn);

        stage.setScene(new Scene(root));
    }

    @Override
    public void stop(){
        Platform.exit();
    }
}
