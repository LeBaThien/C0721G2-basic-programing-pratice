package casestudy.demo.model.contract;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractDetailId;
    private Contract contract;
    private AttachService attachService;

    @ManyToMany
    @JoinTable(name = "contract_detail", joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"));
    private

}
