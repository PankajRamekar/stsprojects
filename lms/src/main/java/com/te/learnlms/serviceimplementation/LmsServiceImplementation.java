package com.te.learnlms.serviceimplementation;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.te.learnlms.entity.AddressDetails;
import com.te.learnlms.entity.BankDetails;
import com.te.learnlms.entity.ContactDetails;
import com.te.learnlms.entity.EducationDetails;
import com.te.learnlms.entity.Employee;
import com.te.learnlms.entity.Experience;
import com.te.learnlms.entity.SecondaryInfo;
import com.te.learnlms.entity.TechnicalSkills;
import com.te.learnlms.entity.dto.GetEmployeeDto;
import com.te.learnlms.entity.dto.RegisterDto;
import com.te.learnlms.entity.dto.ShowDetailsDto;
import com.te.learnlms.entity.dto.UpdateDto;
import com.te.learnlms.repository.employee.AddressDetRepository;
import com.te.learnlms.repository.employee.BankDetRepository;
import com.te.learnlms.repository.employee.ContactInfoRepository;
import com.te.learnlms.repository.employee.EducationDetRepository;
import com.te.learnlms.repository.employee.EmployeeRepository;
import com.te.learnlms.repository.employee.ExperienceDetRepository;
import com.te.learnlms.repository.employee.SecondaryInfoRepository;
import com.te.learnlms.repository.employee.TechnicalSkillsRepository;
import com.te.learnlms.service.LmsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LmsServiceImplementation implements LmsService {

	private final EmployeeRepository employeeRepository;
	private final SecondaryInfoRepository secondaryInfoRepository;
	private final EducationDetRepository educationDetRepository;
	private final AddressDetRepository addressDetRepository;
	private final BankDetRepository bankDetRepository;
	private final TechnicalSkillsRepository technicalSkillsRepository;
	private final ExperienceDetRepository experienceDetRepository;
	private final ContactInfoRepository contactInfoRepository;

	@Override
	public ShowDetailsDto registerEmployee(RegisterDto registerDto) {

		Employee employee = new Employee();
		BeanUtils.copyProperties(registerDto, employee);
		SecondaryInfo secondaryInfo = new SecondaryInfo();
		BeanUtils.copyProperties(registerDto, secondaryInfo);
		List<EducationDetails> educationDetails = registerDto.getEducationDetails();

		List<AddressDetails> details = registerDto.getAddressDetails();

		BankDetails bankDetails = new BankDetails();
		BeanUtils.copyProperties(registerDto, bankDetails);
		List<TechnicalSkills> technicalSkills = registerDto.getTechnicalSkills();
		BeanUtils.copyProperties(registerDto, technicalSkills);
		List<Experience> experiences = registerDto.getExperiences();
		BeanUtils.copyProperties(registerDto, experiences);
		List<ContactDetails> contactDetails = registerDto.getContactDetails();
		BeanUtils.copyProperties(registerDto, contactDetails);

		employee.setAddressDetails(details);
		employee.setSecondaryInfo(secondaryInfo);
		employee.setEducationDetails(educationDetails);
		employee.setBankDetails(bankDetails);
		employee.setTechnicalSkills(technicalSkills);
		employee.setExperiences(experiences);
		employee.setContactDetails(contactDetails);
		employee = employeeRepository.save(employee);

		ShowDetailsDto showDetailsDto = new ShowDetailsDto();
		BeanUtils.copyProperties(registerDto, showDetailsDto);
		return showDetailsDto;
	}

	@Override
	public GetEmployeeDto getDeatils(String empId) {
		// TODO Auto-generated method stub
		GetEmployeeDto getEmployeeDto = new GetEmployeeDto();
		Employee employee = employeeRepository.getById(empId);
		BeanUtils.copyProperties(employee, getEmployeeDto);
		return getEmployeeDto;
	}

	
	@Override
	public ShowDetailsDto updateEmployee(String empId, UpdateDto updateDto) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.getById(empId);
		BeanUtils.copyProperties(updateDto, employee);
		employee = employeeRepository.save(employee);
		ShowDetailsDto showDetailsDto = new ShowDetailsDto();
		BeanUtils.copyProperties(updateDto, showDetailsDto);
		return showDetailsDto;
	}

	
	@Override
	public Boolean deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.getById(empId);
		employeeRepository.delete(employee);
		return true;
	}
 
	 
}
