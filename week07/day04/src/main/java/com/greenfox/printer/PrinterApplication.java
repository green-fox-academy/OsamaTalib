package com.greenfox.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {

  private Printer printer;
  private PrintColor printColor;

  @Autowired
  public PrinterApplication(Printer printer, PrintColor printColor ) {
    this.printer = printer;
    this.printColor=printColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(PrinterApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
printer.log("hello");
printColor.printColor("red");
  }
}

