package clase;

public interface Optiune {
    //Componenta abstractă – OptiuneMeniu – clasă abstractă sau interfață care
    //descrie toate componentele arborescenței;
    void stergeNod(Optiune optiune) throws Exception;

    void adaugaNod(Optiune optiune) throws Exception;

    Optiune getNod(int index) throws Exception;

    void descriere();
}
