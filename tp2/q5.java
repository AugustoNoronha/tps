import java.io.File;
import java.util.*;
import java.text.SimpleDateFormat;

class q5 {
    public static void main(String[] args) throws Exception {
        String[] entrada = new String[1000]; // SET DE ENTRADA
        String[] entradaTosplit = new String[1000]; // SET DE ENTRADA
        Lista list = new Lista(100);
        String command = "", pos = "", aux = "";
        Scanner scanner = new Scanner(new File("/tmp/games.csv"));
        Scanner sc = new Scanner(System.in, "UTF-8");

        int n = 0, x = 0, count = 0, qtd = 0;// COUNT
        Games[] obj = new Games[4403];
        ;
        while (scanner.hasNext()) {
            obj[count] = new Games();

            String[] lineFilter = scanner.nextLine().trim().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
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

        int contador = 0;
        int stop = 0;
        do {
            entrada[n] =  sc.nextLine();
            // MyIO.println(entrada[n]);

        } while (!(isFim(entrada[n++]))); // CONDIÇÃO DE PARADA
        n--; // tirar o FIM

        for (int k = 0; k < n; k++) {
            for (int u = 0; u < obj.length; u++) {
                if (Integer.parseInt(entrada[k]) == obj[u].getAppId()) {
                    list.inserirFim(obj[u]);
                }
            }
        }

        qtd = Integer.parseInt( sc.nextLine());
        do {

            entradaTosplit[x] = sc.nextLine();
            x++;
        } while (qtd > x);

        for (int k = 0; k < x; k++) {

            command = entradaTosplit[k].substring(0, 2);
            if (command.equals("II")) {

                aux = entradaTosplit[k].substring(3);

                for (int l = 0; l < count; l++) {

                    if (Integer.parseInt(aux) == obj[l].getAppId()) {

                        list.inserirInicio(obj[l]);
                    }
                }
            } else if (command.equals("IF")) {

                aux = entradaTosplit[k].substring(3);

                for (int a = 0; a < count; a++) {

                    if (Integer.parseInt(aux) == obj[a].getAppId()) {

                        list.inserirFim(obj[a]);
                    }
                }
            } else if (command.equals("I*")) {

                aux = entradaTosplit[k].substring(6);
                pos = entradaTosplit[k].substring(3, 5);

                for (int b = 0; b < count; b++) {

                    if (Integer.parseInt(aux) == obj[b].getAppId()) {

                        list.inserir(obj[b], Integer.parseInt(pos));
                    }
                }
            } else if (command.equals("RF")) {

                System.out.println("(R) " + list.removerFim().getName());
            } else if (command.equals("RI")) {

                System.out.println("(R) " + list.removerInicio().getName());
            } else if (command.equals("R*")) {

                pos = entradaTosplit[k].substring(3, 5);

                System.out.println("(R) " + list.remover(Integer.parseInt(pos)).getName());
            }

        }

        list.mostrar();

        sc.close();
    }

    static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');

    }

    static class Games {

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
        // link do dateformat
        // https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
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

        void imprimirPrice() {
            System.out.format(Locale.US, "%.2f ", this.price);
        }
    
        void imprimirLinguas() {
    
            System.out.print("[");
    
            if (languages.length == 1)
                System.out.print(languages[0].replaceAll("[\\[\\]']", "") + "] ");
    
            else {
    
                for (int i = 1; i < languages.length - 1; i++)
                    System.out.print(languages[i] + ", ");
    
                System.out.print(languages[languages.length - 1] + "] ");
            }
        }
    
        void imprimirWebSite() {
            if(this.website.isEmpty()){
                System.out.print("null ");
            }else{
                System.out.print(this.website + " ");
            }
        }
    
        void imprimirUpVotes() {
            System.out.print((int) Math.round(this.upvotes * 100) + "% ");
        }
    
        void imprimirAVG() {
            int horasContadas = this.avg_pt / 60, minutosPassados = this.avg_pt % 60;
            if (horasContadas == 0 && minutosPassados == 0)
                System.out.print("null ");
    
            else
            if(horasContadas > 0){
                System.out.print(horasContadas + "h ");
            }else{
                System.out.print(horasContadas + "");
    
            }
            if(minutosPassados > 0){
                System.out.print("m ");
            }else{
                System.out.print("");
    
            }
                // MyIO.print(((horasContadas > 0) ? horasContadas + "h " : "") + ((minutosPassados > 0) ? minutosPassados + "m " : ""));
        }
    
        void imprimirGeneros() {
    
            System.out.print("[");
    
            if (genres.length == 1)
                System.out.print(genres[0].replace("\"", "") + "]\n");
    
            else {
    
                System.out.print(genres[0].replace("\"", "") + ", ");
    
                for (int i = 1; i < genres.length - 1; i++)
                    System.out.print(genres[i] + ", ");
    
                System.out.print(genres[genres.length - 1].replace("\"", "") + "]\n");
            }
        }
    
        void imprimir() {
            
            System.out.printf("%d %s %s %s %d ", this.app_id, this.name, formataador.format(this.release_date), this.owners,
                    this.age);
            imprimirPrice();
            System.out.print(this.dlcs + " ");
            imprimirLinguas();
            imprimirWebSite();
            System.out.printf("%b %b %b ", this.windows, this.mac, this.linux);
            imprimirUpVotes();
            imprimirAVG();
            System.out.print(this.developers.replace("\"", "") + " ");
            imprimirGeneros();
        }
    }

    

    static class Lista {
        private Games[] array;
        private int n;

        /**
         * Construtor da classe.
         */
        public Lista() {
            this(6);
        }

        /**
         * Construtor da classe.
         * 
         * @param tamanho Tamanho da lista.
         */
        public Lista(int tamanho) {
            array = new Games[tamanho];
            n = 0;
        }

        /**
         * Insere um elemento na primeira posicao da lista e move os demais
         * elementos para o fim da lista.
         * 
         * @param x int elemento a ser inserido.
         * @throws Exception Se a lista estiver cheia.
         */
        public void inserirInicio(Games x) throws Exception {

            // validar insercao
            if (n >= array.length) {
                throw new Exception("Erro ao inserir!");
            }

            // levar elementos para o fim do array
            for (int i = n; i > 0; i--) {
                array[i] = array[i - 1];
            }

            array[0] = x;
            n++;
        }

        /**
         * Insere um elemento na ultima posicao da lista.
         * 
         * @param x int elemento a ser inserido.
         * @throws Exception Se a lista estiver cheia.
         */
        public void inserirFim(Games x) throws Exception {

            // validar insercao
            if (n >= array.length) {
                throw new Exception("Erro ao inserir!");
            }

            array[n] = x;
            n++;
        }

        /**
         * Insere um elemento em uma posicao especifica e move os demais
         * elementos para o fim da lista.
         * 
         * @param x   int elemento a ser inserido.
         * @param pos Posicao de insercao.
         * @throws Exception Se a lista estiver cheia ou a posicao invalida.
         */
        public void inserir(Games x, int pos) throws Exception {

            // validar insercao
            if (n >= array.length || pos < 0 || pos > n) {
                throw new Exception("Erro ao inserir!");
            }

            // levar elementos para o fim do array
            for (int i = n; i > pos; i--) {
                array[i] = array[i - 1];
            }

            array[pos] = x;
            n++;
        }

        /**
         * Remove um elemento da primeira posicao da lista e movimenta
         * os demais elementos para o inicio da mesma.
         * 
         * @return resp int elemento a ser removido.
         * @throws Exception Se a lista estiver vazia.
         */
        public Games removerInicio() throws Exception {

            // validar remocao
            if (n == 0) {
                throw new Exception("Erro ao remover!");
            }

            Games resp = array[0];
            n--;

            for (int i = 0; i < n; i++) {
                array[i] = array[i + 1];
            }

            return resp;
        }

        /**
         * Remove um elemento da ultima posicao da lista.
         * 
         * @return resp int elemento a ser removido.
         * @throws Exception Se a lista estiver vazia.
         */
        public Games removerFim() throws Exception {

            // validar remocao
            if (n == 0) {
                throw new Exception("Erro ao remover!");
            }

            return array[--n];
        }

        /**
         * Remove um elemento de uma posicao especifica da lista e
         * movimenta os demais elementos para o inicio da mesma.
         * 
         * @param pos Posicao de remocao.
         * @return resp int elemento a ser removido.
         * @throws Exception Se a lista estiver vazia ou a posicao for invalida.
         */
        public Games remover(int pos) throws Exception {

            // validar remocao
            if (n == 0 || pos < 0 || pos >= n) {
                throw new Exception("Erro ao remover!");
            }

            Games resp = array[pos];
            n--;

            for (int i = pos; i < n; i++) {
                array[i] = array[i + 1];
            }

            return resp;
        }

        /**
         * Mostra os elementos da lista separados por espacos.
         */
        public void mostrar() {
            for(int i = 0; i < n; i++) {
                System.out.print("[" + i + "] ");
                array[i].imprimir();
            }
        }

        /**
         * Procura um elemento e retorna se ele existe.
         * 
         * @param x int elemento a ser pesquisado.
         * @return <code>true</code> se o array existir,
         *         <code>false</code> em caso contrario.
         */
        public boolean pesquisar(String x) {
            boolean retorno = false;
            for (int i = 0; i < n && retorno == false; i++) {
                // System.out.println(array[i].getName() + "\t" + x);
                retorno = array[i].getName().compareTo(x) == 0;
            }
            return retorno;
        }

        
    
       


    }

}
