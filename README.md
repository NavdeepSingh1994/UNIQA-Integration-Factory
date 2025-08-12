# UNIQA Integration Factory – Jenkins CI/CD Setup

Dieses Repository dokumentiert die erfolgreiche Einrichtung und Ausführung einer kompletten **CI/CD-Pipeline mit Jenkins** für ein Java-Maven-Projekt – passend zu den Deployment-Anforderungen im Umfeld von Technical Integration Management.

## Projektziel

Ziel war es, eine funktionierende Jenkins-Pipeline zu erstellen, die:
- Quellcode aus einem **GitHub-Repository** automatisch auscheckt
- Das Java-Projekt mit **Maven** baut
- Unit Tests ausführt
- Das Artefakt (JAR-Datei) archiviert
- In einer Windows-Umgebung mit **JDK 17** und **Apache Maven 3.9.x** lauffähig ist

## Umsetzungsschritte

1. **JDK 17 Installation**
   - Temurin JDK 17 installiert und in den `PATH` sowie als `JAVA_HOME` gesetzt.

2. **Jenkins Installation & Start**
   - Jenkins LTS auf Windows installiert.
   - Start & Test über `http://localhost:8081`.

3. **Apache Maven Installation**
   - Maven 3.9.11 heruntergeladen, entpackt und in den `PATH` + `MAVEN_HOME` eingetragen.
   - Test mit `mvn -v`.

4. **Jenkins Konfiguration**
   - Git-Plugin installiert.
   - Neues Pipeline-Projekt erstellt.
   - GitHub-Repository eingebunden.
   - Build-Trigger manuell für Tests ausgelöst.

5. **Jenkinsfile erstellt**
   - Pipeline mit Maven-Build und Unit-Tests (`bat`-Kommandos für Windows).
   - Artefakte im `target`-Ordner archiviert.

6. **Fehlerbehebung**
   - `sh`-Befehle in `bat`-Befehle umgewandelt.
   - Umgebungsvariablen für Maven und Java korrekt gesetzt.
   - Git-Checkout-Probleme (Branch-Namen) behoben.

7. **Ergebnis**
   - Pipeline erfolgreich ausgeführt.
   - Artefakt im Jenkins-Artefaktbereich archiviert.
   - Setup entspricht einer echten Deployment-Pipeline für Entwicklungs- und Integrationsumgebungen.

## Zusatz, was man noch dazubauen könnte

**TOSCA Smoke Tests – Automatisierte Post-Deployment-Prüfungen**
  - Nach jedem Jenkins-Deployment automatisiert TOSCA-Tests starten, um Kernfunktionalitäten wie Login oder API-Responses sofort zu validieren.

**Splunk Integration – Automatische Log-Analyse**
  - Splunk REST API in die Pipeline integrieren, um nach dem Deployment automatisch nach kritischen Fehlern in Logfiles zu suchen und zu reporten.

**Dynatrace Monitoring – Performance- und Stabilitätschecks**
  - Dynatrace Metrics API nutzen, um direkt nach dem Deployment KPIs wie Latenz und Fehlerrate zu prüfen und bei Abweichungen sofort zu eskalieren.


# Bewerbungsprofil – Navdeep Singh
## Bewerbung auf die Position „Technical Integrationmanager“ bei UNIQA

Dieses Repository begleitet meine Bewerbung bei **UNIQA IT Services GmbH** und dient als praktischer Nachweis meiner Fähigkeiten im Bereich **Deployment-Management, CI/CD-Pipelines, Fehleranalyse und Prozessoptimierung**.  
Als **Senior Cloud Operations Engineer** bringe ich fundierte technische Erfahrung in **Build- und Deployment-Automatisierung** mit – eine ideale Grundlage für die Rolle als Technical Integrationmanager.


## Fachliche Schwerpunkte

**Deployment & Integration**
- Einrichtung und Betrieb von **Jenkins CI/CD-Pipelines** für Java/Maven-Projekte
- Git-Integration, Build-Automatisierung, Artefaktmanagement
- Enge Zusammenarbeit mit Test- und Entwicklungsteams zur Sicherstellung reibungsloser Deployments

**Fehleranalyse & Monitoring**
- Erfahrung mit **Dynatrace** 
- Technische Smoke-Tests und Testportfolio-Pflege
- Root-Cause-Analysen, KPI-Reporting und Prozessverbesserungen

**Technische Kompetenz**
- **Java, JEE, HTTP, SQL** Grundlagen
- CI/CD (Jenkins, GitHub Actions)
- ServiceNow, Jira, Confluence
- Cloud & Container:  Docker, ArgoCD
- Betrieb in hybriden IT-Infrastrukturen (Cloud & On-Premises)

## Berufliche Stationen (Auszug)

**Senior Cloud Operations Engineer**, Allianz Technology GmbH  
*07/2025 – 08/2025*  
Leitung und Koordination von Deployments auf internationalen Staging- und Produktionsumgebungen

**Cloud Operations Engineer**, Allianz Technology GmbH  
*04/2024 – heute*  
CI/CD, Kubernetes, Java-Tools, SCRUM-Teamarbeit, internationale Projektumgebung

**Senior Incident Manager**, Allianz Technology GmbH  
*05/2021 – 12/2023*  
Verantwortlich für Major Incidents, RCA, SLA-Monitoring, internationale Eskalationskoordination

**IT User Support**, Allianz Technology GmbH  
*07/2017 – 04/2021*  
2nd-Level-Support, Prozessoptimierung, Schnittstelle zwischen Usern, Entwicklung und Betrieb

## Projekterfahrung (Auszug)

| Projekt | Beschreibung |
|--------|--------------|
| [SmartFit – AI Chatbot](https://github.com/NavdeepSingh1994/smartfit-chatbot) | Coaching-App mit BMI-, BMR-, TDEE-Berechnung, KI-Empfehlungen über Mistral-7B & GPT-4 |
| [AGB-KI](https://github.com/NavdeepSingh1994/AGB-KI) | Klassifikation von AGBs mittels DistilBERT zur Automatisierung juristischer Einschätzungen |
| [flightops-incident-dashboard](https://github.com/NavdeepSingh1994/IKF) | Incident-Koordinations-Dashboard (Python + GPT) zur Visualisierung und Risikobewertung |

## Sprachkenntnisse

- Deutsch: Muttersprache  
- Englisch: C1 (Berlitz-Zertifikat, 2018)  
- Weitere Sprachen: Hindi, Punjabi


## Ausbildung & Zertifizierungen

- **Bachelor of Science** – Computer Science & Digital Communication *(Abschluss 04.10.25)*  
- **HTL Donaustadt** – Informationstechnologie / Netzwerktechnik  
- **Geplante Zertifizierungen:**
  - PMA Level D (02.09.2025)
  - PSM I Scrum Master (26.09.2025)
  - Ingenieur-Titel (22.08.2025)


## Warum UNIQA?

Die Rolle als **Technical Integrationmanager** verbindet meine Stärken in **technischer Umsetzung, Fehleranalyse und Deployment-Management**.  
Meine Erfahrung im Betrieb komplexer CI/CD-Pipelines und in der Abstimmung zwischen Entwicklung, Test und Betrieb ermöglicht es mir, UNIQA bei der **Integration und Qualitätssicherung von Software-Releases** effektiv zu unterstützen.  
Ich bringe sowohl die technische Tiefe als auch die Kommunikationsstärke mit, um Deployments zuverlässig, transparent und strukturiert durchzuführen.


# Private Interessen<br/>
  Sprachlich:<br/>
  Kampfsport:<br/>
  Wiedereinstieg in Krav Maga seit Juli 2025, Ziel: Schwarzer Gurt / Level 5, Prüfung Ende September<br/>
  3x die Woche Kraftsport und jeden Tag 10000 Schritte<br/>
  Autodiktisches Lernen um mein Skillset in verschiedensten Programmiersprachen zu erweitern damit tieftechnische Wissen in Projekten aufgebaut wird.

# Persönliche Weiterentwicklung<br/>

  Master in AI ab 2028 auf der FH Technikum Wien, Donnerstag und Freitag am Abend vor Ort, Uhrzeit: 18:00 - 21:00<br/>
  PMA Level C Zertifikat ab 2026<br/>

## Kontakt

**Navdeep Singh**  
navdeepsingh@live.at  
Wien  
[LinkedIn-Profil](https://www.linkedin.com/in/navdeep-singh-9a6248159)
