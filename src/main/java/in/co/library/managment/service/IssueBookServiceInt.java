package in.co.library.managment.service;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import in.co.library.managment.dto.IssueBookDTO;
import in.co.library.managment.exception.DuplicateRecordException;

public interface IssueBookServiceInt {

	public long add(IssueBookDTO dto) throws DuplicateRecordException;

	public void delete(IssueBookDTO dto);

	public IssueBookDTO findBypk(long pk);

	public IssueBookDTO findByName(String name);

	public void update(IssueBookDTO dto) throws DuplicateRecordException;

	public List<IssueBookDTO> list();

	public List<IssueBookDTO> list(int pageNo, int pageSize);

	public List<IssueBookDTO> search(IssueBookDTO dto);

	public List<IssueBookDTO> search(IssueBookDTO dto, int pageNo, int pageSize);


}
