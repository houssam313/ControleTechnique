/*
 * package fr.cda.controle.test;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * import org.junit.jupiter.api.DisplayName; import org.junit.jupiter.api.Test;
 * import org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.test.annotation.DirtiesContext; import
 * org.springframework.test.context.ContextConfiguration;
 * 
 * import fr.cda.controle.beans.Status; import
 * fr.cda.controle.converter.StatusConverter; import
 * fr.cda.controle.dto.StatusDTO; import
 * fr.cda.controle.errors.AlreadyExistException;
 * 
 * import fr.cda.controle.errors.NotFoundException; import
 * fr.cda.controle.repositories.StatusRepository; import
 * fr.cda.controle.service.StatusService; import
 * org.springframework.test.context.junit4.SpringRunner; import static
 * org.junit.Assert.assertEquals;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.junit.Before;
 * 
 * import org.springframework.jdbc.core.JdbcTemplate;
 * 
 * 
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @ContextConfiguration(classes = DataSourceRoutingTestConfiguration.class)
 * 
 * @DirtiesContext public class StatusServiceTest {
 * 
 * public String STATUS_TYPE = "developper"; public static final String
 * STATUS_ALREADY_EXIST = "Status already Exist"; public static final String
 * STATUS_NOT_FOUND = "Status not found";
 * 
 * @Autowired private StatusService statusService;
 * 
 * @Autowired private StatusConverter statusConverter;
 * 
 * @Autowired private StatusRepository statusRepository;
 * 
 * @Test
 * 
 * @DisplayName("adds new status that does not existe in database should passed correctly"
 * ) public void addStatusTest() throws AlreadyExistException, NotFoundException
 * { StatusDTO status = new StatusDTO(); // StatusDTO statusDTO =
 * statusConverter.EntityToDTO(status); statusService.addStatus(status);
 * assertEquals("test should pass OK because Status is not duplicated in database"
 * , STATUS_TYPE, statusRepository.findByType(STATUS_TYPE).getType()); }
 * 
 * }
 * 
 * @Test
 * 
 * @DisplayName("adds Same team twice should give Exception")public void
 * 
 * addsTeamTest_addSameTeam() throws TeamAlreadyExistException {
 * teamService.addTeam(TEAM_NAME); TeamAlreadyExistException thrown =
 * assertThrows(TeamAlreadyExistException.class, () -> {
 * teamService.addTeam(TEAM_NAME); }, "Team name should be unique ");
 * assertEquals(TEAM_ALREADY_EXIST, thrown.getMessage()); }
 * 
 * @Test
 * 
 * @DisplayName("make sure Id of dto equals Id of object") public void
 * addsTeamTest_assertDtoID() throws TeamAlreadyExistException { TeamDTO teamDTO
 * = teamService.addTeam(TEAM_NAME);
 * assertEquals("to make sure real id is returned in DTO",
 * teamRepository.findFirstByTeamNameIgnoreCase(TEAM_NAME).getTeamId(),
 * teamDTO.getTeamId());
 * 
 * }
 * 
 * test for delete method
 * 
 * @Test
 * 
 * @DisplayName("delete non existing team should throw TeamNotFoundException ")
 * 
 * void delete_unExistingTeam() { assertThrows(TeamNotFoundException.class, ()
 * -> teamService.delete(TEAM_NAME)); }
 * 
 * @Test
 * 
 * @DisplayName("delete existing should pass ok") void
 * delete_deleteExistingTeam() throws TeamNotFoundException { Team team = new
 * Team(); team.setTeamName(TEAM_NAME);
 * 
 * teamRepository.save(team); List<TeamDTO> teamDTOS =
 * teamService.delete(TEAM_NAME); Assertions.assertEquals(1, teamDTOS.size());
 * assertEquals(TEAM_NAME, teamDTOS.get(0).getTeamName()); }
 * 
 * test for getTem method
 * 
 * @Test void getTeam() throws TeamNotFoundException { TeamNotFoundException
 * thrown = assertThrows(TeamNotFoundException.class, () ->
 * teamService.getTeam(TEAM_NAME)); assertEquals(TEAM_NOT_FOUND,
 * thrown.getMessage()); teamRepository.save(new Team(TEAM_NAME)); TeamDTO
 * teamDTO = teamService.getTeam(TEAM_NAME); assertEquals(TEAM_NAME,
 * teamDTO.getTeamName());
 * assertEquals(teamRepository.findFirstByTeamNameIgnoreCase(TEAM_NAME).
 * getTeamId(), teamDTO.getTeamId()); }
 * 
 * @Test void getAllTeams() throws TeamNotFoundException { TeamNotFoundException
 * thrown = assertThrows(TeamNotFoundException.class, () ->
 * teamService.getAllTeams(), "thrown if table team is empty");
 * assertEquals(TEAM_NOT_FOUND, thrown.getMessage()); List<Team> teams = new
 * ArrayList<Team>( Arrays.asList(new Team[] { new Team("1"), new Team("2"), new
 * Team("3") })); teamRepository.saveAll(teams); assertTrue(teams.size() ==
 * teamService.getAllTeams().size()); }
 * 
 * 
 */