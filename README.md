# football-rest-api
Rest api using java spring framework

## API Documentation
This API provides the English Premier League's information from 2010/11 to 2019/20 season.<br/>
Resources are represented as a JSON.

### Available resources
| Resource | Action | URI<br/> (Root: `https://football-result.herokuapp.com`) | Parameters |
| ------ | -------- |------ | ------ | 
| Season | List all seasons |/api/v1/seasons |  | 
| SeasonDetail | List one particular season in detail | /api/v1/seasons/{seasonId} | |
| Team | List all teams |/api/v1/teams |  |
| Match | List all matches |/api/v1/matches | from={YYYY-MM-DD}<br/>to={YYYY-MM-DD}<br/>teamId={teamId}<br/>(No parameter shows all matches) | 

### Example Requests

* https://football-result.herokuapp.com/api/v1/seasons
<br/>See all available seasons.
* https://football-result.herokuapp.com/api/v1/seasons/27
<br/>See 2019/20 season in detail.
* https://football-result.herokuapp.com/api/v1/teams
<br/>See all teams.
* https://football-result.herokuapp.com/api/v1/matches?from=2019-08-01&to=2020-01-01&teamId=1
<br/>See Manchester Utd's matches held from 2019-08-01 to 2020-01-01.

### Resource object
##### Season
```javascript
{
    "seasonId" : 24,
    "seasonName" : "eng.1.2007/08"
}
```

##### SeasonDetail
```javascript
{
    "seasonId" : 27,
    "seasonName" : "eng.1.2019/20",
    "seasonTeams" : [ { //List of all teams for this season
        "teamId" : 1,
        "key" : "manutd",
        "title" : "Manchester United FC",
        "synonyms" : "Man Utd|Man. United|Manchester U.|Manchester Utd|Manchester United"
    }, {
        "teamId" : 2,
        "key" : "chelsea",
        "title" : "Chelsea FC",
        "synonyms" : "Chelsea|FC Chelsea"
    }, {
        "teamId" : 3,
        "key" : "mancity",
        "title" : "Manchester City FC",
        "synonyms" : "Man City|Manchester City|Man. City|Manchester C"
    }, {
        "teamId" : 4,
        "key" : "arsenal",
        "title" : "Arsenal FC",
        "synonyms" : "Arsenal|FC Arsenal"
    },
    ...
}
```
##### Team
```javascript
{
    "teamId" : 6,
    "key" : "liverpool",
    "title" : "Liverpool FC",
    "synonyms" : "Liverpool|FC Liverpool"
}
```
##### Match (Any cancelled or future match's homeScore and awayScore is represented as ```null```.)
```javascript
{
    "matchId" : 3618,
    "playDate" : "2019-12-29",
    "home" : "Arsenal FC",
    "away" : "Chelsea FC",
    "homeScore" : 1, //Any cancelled or future match's homeScore and awayScore is represented as null.
    "awayScore" : 2
}
```
