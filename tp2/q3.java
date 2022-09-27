import java.io.File;
import java.util.*;
import java.text.SimpleDateFormat;
class q3 {
    public static void main(String[] args) throws Exception {
        String[] entrada = new String[1000]; // SET DE ENTRADA
        Scanner scanner = new Scanner(new File("/tmp/games.csv"));
        // Scanner scanner = new Scanner(new File("E:\\Facudade\\tp2\\games.csv"));
        int n = 0, count = 0;// COUNT
        Games[] obj = new Games[4403];
        // String file = "/tmp/games.csv";
        // String file = "E:\\Facudade\\tps\\tp2\\games.csv";
        // FileReader fr = new FileReader(file);
        // BufferedReader br = new BufferedReader(fr);
        // String line = br.readLine();
        while (scanner.hasNext()) {

            obj[count] = new Games();

            String[] lineFilter = scanner.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            obj[count].setAppId(Integer.parseInt(lineFilter[0]));
            obj[count].setName(lineFilter[1]);
            String dateFormate = lineFilter[2].replace("\"", "");
            String date = dateFormate.substring(0, 3) + "/"
                    + dateFormate.substring(dateFormate.length() - 4, dateFormate.length());
            obj[count].setDate((new SimpleDateFormat("MMM/yyyy", Locale.US).parse(date)));
            obj[count].setOwners(lineFilter[3]);
            obj[count].setAge(Integer.parseInt(lineFilter[4]));
            obj[count].setPrice(Float.parseFloat(lineFilter[5]));
            obj[count].setDlcs(Integer.parseInt(lineFilter[6]));
            obj[count].setLanguages(lineFilter[7].split("(\"\\[')|(', ')|('\\]\")"));
            obj[count].setWebsite(lineFilter[8]);
            obj[count].setWindows(Boolean.valueOf(lineFilter[9]));
            obj[count].setMac(Boolean.valueOf(lineFilter[10]));
            obj[count].setLinux(Boolean.valueOf(lineFilter[11]));
            obj[count].setUpVotes(Float.parseFloat(lineFilter[12])
                    / (Float.parseFloat(lineFilter[12]) + Float.parseFloat(lineFilter[13])));
            obj[count].setAvg_pt(Integer.parseInt(lineFilter[14]));
            obj[count].setDevelopers(lineFilter[15]);
            obj[count].setGenres((lineFilter.length > 16) ? lineFilter[16].split(",") : null);
            count++;
        }
        scanner.close();

        do {
            entrada[n] = MyIO.readLine();
            // System.out.println(entrada[n]);
             // LEITURA DA LINHA DE ENTRADA
        } while (!(isFim(entrada[n++]))); // CONDIÇÃO DE PARADA
        n--; // tirar o FIM

        for (int k = 0; k < n; k++) {
        
                if (entrada[k] == obj[k].getName()){
                    System.out.println("SIM");
                }else{
                    // System.out.println(entrada[k]);
                    // System.out.println(obj[k].getAppId());


                    System.out.println("NAO");
                  
                }
        }
    }

    static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'); // metodo de
                                                                                                    // condição de
                                                                                                    // parada
    }
}

class Games {

    // atributos da classe
    private int app_id;
    private int age;
    private int avg_pt;
    private int dlcs;
    private Date release_date;
    private String name;
    private String owners;
    private String website;
    private String developers;
    private String[] languages;
    private String[] genres;
    private float price;
    private float upvotes;
    private boolean windows;
    private boolean mac;
    private boolean linux;

    // SimpleDateFormat formataador = new SimpleDateFormat("MMM/yyyy", Locale.US);

    // Constructors


    Games() {
    app_id = 0;
    name = "";
    release_date = null;
    owners = "";
    age = 0;
    price = 0;
    dlcs = 0;
    languages = null;
    website = "";
    windows = true;
    mac = true;
    linux = true;
    upvotes = 0;
    avg_pt = 0;
    developers = "";
    genres = null;
    }
    // métodos da classe
    //link do dateformat
    //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
    SimpleDateFormat formataador = new SimpleDateFormat("MMM/yyyy", Locale.US);

    public int getAppId() {
        return this.app_id;
    }

    public void setAppId(int app_id) {
        this.app_id = app_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return formataador.format(this.release_date);
    }

    public void setDate(Date release_date) {
        this.release_date = release_date;
    }

    public String getOwners() {
        return this.owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDlcs() {
        return this.dlcs;
    }

    public void setDlcs(int dlcs) {
        this.dlcs = dlcs;
    }

    public String[] getLanguages() {
        return this.languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getWindows() {
        return this.windows;
    }

    public void setWindows(Boolean windows) {
        this.windows = windows;
    }

    public Boolean getMac() {
        return this.mac;
    }

    public void setMac(Boolean mac) {
        this.mac = mac;
    }

    public Boolean getLinux() {
        return this.linux;
    }

    public void setLinux(Boolean linux) {
        this.linux = linux;
    }

    public Float getUpVotes() {
        return this.upvotes;
    }

    public void setUpVotes(float upvotes) {
        this.upvotes = upvotes;
    }

    public int getAvg_pt() {
        return this.avg_pt;
    }

    public void setAvg_pt(int avg_pt) {
        this.avg_pt = avg_pt;
    }

    public String getDevelopers() {
        return this.developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String[] getGenres() {
        return this.languages;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

   

}
