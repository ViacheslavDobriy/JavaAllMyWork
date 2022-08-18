package Seminars.SeminarOOP5;

public interface Repository <T, ID>{

    public ID save(T t);
    public T findByID(ID id);
    public void deleteByID(ID id);

}
