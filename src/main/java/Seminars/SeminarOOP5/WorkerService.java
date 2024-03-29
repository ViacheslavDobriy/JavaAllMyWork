package Seminars.SeminarOOP5;

public class WorkerService {
    Repository<Worker, Long> repo;

    public void setRepo(Repository<Worker, Long> repo) {
        this.repo = repo;
    }
    public void addWorker(Worker worker){
        repo.save(worker);
    }
    public WorkerService(Repository<Worker, Long> repo) {
        this.repo = repo;
    }
}
