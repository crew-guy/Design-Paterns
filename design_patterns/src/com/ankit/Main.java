package com.ankit;

import com.ankit.abusingStatePattern.Stopwatch;
import com.ankit.adapter.*;
import com.ankit.adapter.thirdPartyFilters.CaramelFilter;
import com.ankit.chainOfResponsibility.Compressor;
import com.ankit.chainOfResponsibility.*;
import com.ankit.command.AddCustomerCommand;
import com.ankit.command.CustomerService;
import com.ankit.command.compositeCommand.BlackAndWhite;
import com.ankit.command.compositeCommand.CompositeCommand;
import com.ankit.command.compositeCommand.WoodenFrame;
import com.ankit.command.fx.Button;
import com.ankit.command.undo.BoldCommand;
import com.ankit.command.undo.HtmlDoc;
import com.ankit.command.undo.UndoCommand;
import com.ankit.composite.Group;
import com.ankit.composite.Shape;
import com.ankit.decorator.CloudStream;
import com.ankit.decorator.CompressedCloudStream;
import com.ankit.decorator.EncryptedCloudStream;
import com.ankit.decorator.Stream;
import com.ankit.iterator.BrowseHistory;
import com.ankit.iterator.Iterator;
import com.ankit.mediator.ArticlesDialogBox;
import com.ankit.memento.Editor;
import com.ankit.memento.History;
import com.ankit.observer.Chart;
import com.ankit.observer.DataSource;
import com.ankit.observer.Spreadsheet;
import com.ankit.state.Canvas;
import com.ankit.state.EraserTool;
import com.ankit.strategy.*;
import com.ankit.templateMethod.GenerateReportTask;
import com.ankit.templateMethod.TransferMoneyTask;
import com.ankit.visitor.*;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Ankit");
        user1.fav_book = "Sapiens";
        user1.sayHello(23);

        // This is an example of COUPLING => If child class is changed and re-compiled, so will parent class
        // ANALOGY => You gotta change the engine to fix the tire. Seems stupid and unncessary
        // CODE =>

//        var calculator = new TaxCalculator2019(); OR;
//        TaxCalculator2019 calculator = new TaxCalculator2019()


        // This is an example of DECOUPLING. Since we are PROGRAMMING THROUGH AN INTERFACE, parent class won't recompile on changing child class
        // INTERFACE => A CONTRACT that specifies the capabilities that a class should provide
        // ANALOGY => We don't need to change the engine to fix the tire
        // This object belongs to an interface (TaxCalculator) and not a class (TaxCalculator2019)
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        System.out.println(calculator);


        // ENCAPSULATION => Hiding certain details in child class from parent class
        // REASON => You may not need to access all the functions from the child class in the parent class
        // ANALOGY => You mustn't let anyone access bank account balance just like that (it can be manipulated). Hence, we encapsulate balance in a separate class, instances of which can only access balance via withdraw, deposit methods, getBalance => all of which we can call only after authn, authzn check out
        var my_acc = new Account();
        my_acc.deposit((float) 20.2);
        my_acc.withdraw(10);
        System.out.println(my_acc.getBalance());

        // ABSTRACTION => Just abstract away some unrequired class methods i.e. Reduce complexity by hiding unnecessary details
        // ANALOGY => You don't need to communicate with transistors to increase volume via a TV remote. You just interact with the buttons. Rest all functionality is just IMPLEMENTATION DETAIL (how stuff is implemented under the hood)
        var mail = new MailService();
        mail.getEmail();

        // INHERITANCE => Mechanism for using reusableW code
        // EXAMPLE => Building a GUI using the same basic class (UIControl) for diff classes like TextBox, CheckBox, Navbar etc.
        var textBox = new TextBox();
        textBox.enable();


        // POLYMORPHISM => Many different forms of instances derived from the same base class
        drawUIControl(new TextBox());

        // THE MEMENTO PATTERN
        System.out.println("--------------------------------");
        System.out.println("MEMENTO PATTERN");
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
        System.out.println("--------------------------------");

//        THE STATE PATTERN
        System.out.println("--------------------------------");
        System.out.println("STATE PATTERN");

        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println("--------------------------------");

        // ABUSING THE STATE PATTERN
        System.out.println("--------------------------------");
        System.out.println("ABUSING THE STATE PATTERN");
        var stopwatch = new Stopwatch();
        stopwatch.click();

        System.out.println("--------------------------------");

        //  THE ITERATOR PATTERN
        System.out.println("--------------------------------");
        System.out.println("ITERATOR PATTERN");
        var iteratorHistory = new BrowseHistory();
        iteratorHistory.push("a");
        iteratorHistory.push("b");
        iteratorHistory.push("c");

        Iterator iterator = iteratorHistory.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }


        System.out.println("--------------------------------");

        //  THE STRATEGY PATTERN
        System.out.println("--------------------------------");
        System.out.println("STRATEGY PATTERN");
        var imageStorage = new ImageStorage();
        imageStorage.store("image1",new JpegCompressor(), new BandWFilter());
        imageStorage.store("image1",new PngCompressor(), new RGBFilter());
        System.out.println("--------------------------------");

        //  THE TEMPLATE MODEL PATTERN
        System.out.println("--------------------------------");
        System.out.println("TEMPLATE MODEL PATTERN");
        var task = new TransferMoneyTask();
        task.execute();
        var task2 = new GenerateReportTask();
        task.execute();
        task2.execute();
        System.out.println("--------------------------------");

        //  THE COMMAND PATTERN
        System.out.println("--------------------------------");
        System.out.println("COMMAND PATTERN");
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
        System.out.println("--------------------------------");
        System.out.println("Composite Commands` (using the command pattern)");
        var blackAndWhiteCmd = new BlackAndWhite();
        var woodenFrameCmd = new WoodenFrame();
        var compositeCmd = new CompositeCommand();
        compositeCmd.addCommand(blackAndWhiteCmd);
        compositeCmd.addCommand(woodenFrameCmd);
        compositeCmd.execute();
        System.out.println("--------------------------------");
        System.out.println("Implementing undo using the command pattern");
        var document = new HtmlDoc();
        var historyOfCmds = new com.ankit.command.undo.History();
        var boldCommand = new BoldCommand(document,historyOfCmds);
        document.setContent("Namaskar !");
        System.out.println(document.getContent());

        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(historyOfCmds);
        undoCommand.execute();
        System.out.println(document.getContent());

        System.out.println("--------------------------------");

        //  THE OBSERVER PATTERN
        System.out.println("--------------------------------");
        System.out.println("OBSERVER PATTERN");
        var dataSrc = new DataSource();
        var sheet1 = new Spreadsheet();
        var sheet2 = new Spreadsheet();
        var chart = new Chart();

        dataSrc.addObserver(sheet1);
        dataSrc.addObserver(sheet2);
        dataSrc.addObserver(chart);

        dataSrc.setValue(1);
        System.out.println("--------------------------------");

        //  THE MEDIATOR PATTERN
        System.out.println("--------------------------------");
        System.out.println("MEDIATOR PATTERN");
        var articleDialogBox = new ArticlesDialogBox();
        articleDialogBox.simulateUserInteraction();
        System.out.println("--------------------------------");

        //  THE CHAIN OF RESPONSIBILITY PATTERN
        System.out.println("--------------------------------");
        System.out.println("CHAIN OF RESPONSIBILITY PATTERN");
        // authentication -> compressing -> logging
        var logger = new Logger(null);
        var compressor = new Compressor(logger);
        var authenticator = new Authenticator(compressor);
        var webServer = new WebServer(authenticator);

        var request = new HttpRequest("admin", "admin1234");
        webServer.handle(request);

        System.out.println("--------------------------------");

        //  THE VISITOR PATTERN
        System.out.println("--------------------------------");
        System.out.println("VISITOR PATTERN");
        var htmlDocument = new HtmlDocument();
        var headingNode= new HeadingNode();
        var anchorNode = new AnchorTagNode();
        htmlDocument.add(headingNode);
        htmlDocument.add(anchorNode);
        System.out.println("Extracting plain text from html tags....");
        htmlDocument.execute(new PlainTextOperation());
        System.out.println("Highlighting html tags.......");
        htmlDocument.execute(new HighlightOperation());
        System.out.println("--------------------------------");

        //  THE COMPOSITE PATTERN
        System.out.println("--------------------------------");
        System.out.println("COMPOSITE PATTERN");
        var shape1 = new Shape();
        var shape2 = new Shape();
        var shape3 = new Shape();
        var shape4 = new Shape();
        var group1 = new Group();
        var group2 = new Group();
        var group = new Group();
        group1.add(shape1);
        group1.add(shape2);
        group2.add(shape3);
        group2.add(shape4);
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
        System.out.println("--------------------------------");

        //  THE ADAPTER PATTERN
        System.out.println("--------------------------------");
        System.out.println("ADAPTER PATTERN");
        var image = new Image();
        var imageView = new ImageView(image);
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelAdapterOne(new CaramelFilter()));
        imageView.apply(new CaramelAdapterTwo());
        System.out.println("--------------------------------");

        //  THE DECORATOR PATTERN
        System.out.println("--------------------------------");
        System.out.println("DECORATOR PATTERN");
        var stream = new CloudStream();
        var encryptedStream = new EncryptedCloudStream(stream);
        var compressedStream = new CompressedCloudStream(encryptedStream);
        storeCreditCard(compressedStream);
        var stream2 = new EncryptedCloudStream(new CompressedCloudStream(new EncryptedCloudStream(new CloudStream())));
        storeCreditCard(stream2);
        System.out.println("--------------------------------");
    }
    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-1234");
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }

    // Object created belongs to the interface and not the specific class
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
