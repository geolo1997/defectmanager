package group.geolo.defectmanager.repository;

import group.geolo.defectmanager.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 桀骜(Geolo)
 * @version 1.0
 * @date 2019/10/11
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
