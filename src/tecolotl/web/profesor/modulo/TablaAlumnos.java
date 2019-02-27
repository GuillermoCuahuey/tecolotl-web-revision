package tecolotl.web.profesor.modulo;

public class TablaAlumnos {

    private String nickname;
    private String estatus;
    private String nivel;
    private int listen;
    private int trasncript;
    private int read;
    private int gramman;
    private int quizzes;
    private String lvl;
    private Integer id;

    public TablaAlumnos() {
    }

    public TablaAlumnos(String nickname, String estatus, String nivel, int listen, int trasncript, int read, int gramman, int quizzes, String lvl, Integer id) {
        this.nickname = nickname;
        this.estatus = estatus;
        this.nivel = nivel;
        this.listen = listen;
        this.trasncript = trasncript;
        this.read = read;
        this.gramman = gramman;
        this.quizzes = quizzes;
        this.lvl = lvl;
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getListen() {
        return listen;
    }

    public void setListen(int listen) {
        this.listen = listen;
    }

    public int getTrasncript() {
        return trasncript;
    }

    public void setTrasncript(int trasncript) {
        this.trasncript = trasncript;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getGramman() {
        return gramman;
    }

    public void setGramman(int gramman) {
        this.gramman = gramman;
    }

    public int getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(int quizzes) {
        this.quizzes = quizzes;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
