package info.thecodinglive.hiber.service;


import info.thecodinglive.hiber.model.Team;
import info.thecodinglive.hiber.repository.TeamDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{

    @Autowired
    private TeamDao teamDao;

    @Override
    public void addTeam(Team team) {
        System.out.println(teamDao);
        teamDao.addTeam(team);
    }

    @Override
    public void updateTeam(Team team) {
        teamDao.updateTeam(team);
    }

    @Override
    public Team getTeam(int id) {
        return teamDao.getTeam(id);
    }

    @Override
    public void deleteTeam(int id) {
        teamDao.deleteTeam(id);
    }

    @Override
    public List<Team> getTeams() {
        return teamDao.getTeams();
    }
}
