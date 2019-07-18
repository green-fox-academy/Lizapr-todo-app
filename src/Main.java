public class Main {
  public static void main(String[] args) {
    PrintUsage printUsage = new PrintUsage();
    ListTasks listTasks = new ListTasks();

    if (args.length == 0){
      printUsage.print();
    } else if (args[0].equals("-l")){
      listTasks.readFile();
    }
    }
  }

