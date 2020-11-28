package bhargava.kartik.ppmtool.services;

import bhargava.kartik.ppmtool.domain.Project;
import bhargava.kartik.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public Project saveOrUpdateProject(Project project) {
        return projectRepository.save(project);
    }
}
