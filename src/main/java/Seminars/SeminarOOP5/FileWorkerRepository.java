package Seminars.SeminarOOP5;

public class FileWorkerRepository implements Repository<Worker, Long>{
    @Override
    public Long save(Worker worker) {
        System.out.println("save to file");
        return null;
    }

    @Override
    public Worker findByID(Long aLong) {
        return null;
    }

    @Override
    public void deleteByID(Long aLong) {

    }
}
