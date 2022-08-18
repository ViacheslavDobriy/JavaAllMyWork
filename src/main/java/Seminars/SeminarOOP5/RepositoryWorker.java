package Seminars.SeminarOOP5;

import java.util.List;

public class RepositoryWorker implements Repository<Worker, Long>{
    @Override
    public Long save(Worker worker) {
        List<WorkerData> workerTable = DataBase.getWorkerTable();
        workerTable.add(new WorkerData(worker));
        System.out.println("save to data base");
        return WorkerData.getId();
    }

    @Override
    public Worker findByID(Long aLong) {
        return null;
    }

    @Override
    public void deleteByID(Long aLong) {

    }
}
