
public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "./files/input.csv";
		ReadCsvFile cs=new ReadCsvFile();
		//System.out.println(cs.readAllLines(path));
		CSVReader r =new CSVReader();
		r.read(path);
	}

}
