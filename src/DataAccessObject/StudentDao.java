package DataAccessObject;

import java.util.List;

//�������ݷ��ʶ���ӿڡ�
public interface StudentDao {
	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);
}
