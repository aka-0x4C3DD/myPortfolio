### What kind of attack has happened and why do you think so?

The attack appears to be a **phishing attack** coupled with potential **malware installation**:

1. **Phishing Attack**: Employees received an email posing as HR, asking them to update timesheets via a fake portal. This fake portal was designed to steal their credentials. Phishing is a common attack where adversaries deceive users into sharing sensitive information by pretending to be legitimate entities.
   
2. **Malware/ Ransomware Attack**: Later in the day, employees reported that they could not access file shares or open Word documents, indicating a potential **ransomware** or other malware infection. Ransomware encrypts files and restricts access until a ransom is paid, often following phishing or malicious email campaigns.

### As a cyber security analyst, what are the next steps to take? List all that apply.

1. **Isolate affected systems**: Immediately disconnect the systems of affected employees (those who received and acted on the phishing email) from the network to prevent further spread of the malware or data exfiltration.
   
2. **Notify internal stakeholders**: Inform the IT department, leadership, and other relevant teams about the phishing attack and the potential malware/ransomware infection to coordinate a rapid response.

3. **Assess the scope of the attack**: Identify how many employees have been compromised and whether any critical systems have been affected. Determine if data has been exfiltrated or encrypted.

4. **Reset credentials**: Force a company-wide password reset, especially for those users who entered credentials into the phishing portal, to ensure that compromised accounts are secured.

5. **Preserve evidence**: Capture forensic data from affected systems (e.g., network traffic, email copies, affected files) to investigate the attack and trace its origin.

6. **Quarantine suspicious emails**: Use email filters to quarantine or delete similar phishing emails still present in other employees' inboxes to prevent further spread.

### How would you contain, resolve, and recover from this incident? List all that apply.

1. **Containment**:
   - **Isolate affected endpoints**: Disconnect infected devices from the network to prevent further damage or spread of the malware.
   - **Block malicious domains**: Block the fake HR portal and other associated malicious domains at the firewall or DNS level.
   - **Restrict administrative privileges**: Temporarily revoke high-privilege access across systems to limit the attacker's reach.

2. **Resolution**:
   - **Conduct root cause analysis**: Investigate the phishing email campaign to identify how the emails bypassed security controls (e.g., insufficient email filtering, lack of employee training).
   - **Scan systems for malware**: Perform thorough malware and virus scans on all potentially infected systems using up-to-date antivirus and anti-malware tools.
   - **Update security patches**: Ensure that all systems have the latest security updates and patches applied to address vulnerabilities.

3. **Recovery**:
   - **Restore backups**: If files have been encrypted (ransomware attack), restore from clean backups if available. Ensure that backups are malware-free.
   - **Reimage compromised systems**: If necessary, reimage any compromised machines to restore them to a clean state.
   - **Re-enable services**: Once systems are clean and secured, restore normal operations and ensure all services are functioning properly.

### What activities should be performed post-incident?

1. **Incident report**: Document the entire incident, from detection through resolution, including all actions taken, evidence collected, and affected systems.

2. **Post-incident review**: Conduct a formal post-mortem to evaluate the effectiveness of the response, identify gaps, and propose improvements to incident response procedures.

3. **Strengthen security awareness**: Educate employees on recognizing phishing emails, and conduct phishing simulations to test their awareness.

4. **Improve detection mechanisms**: Enhance email filtering and network monitoring systems to better detect and block future phishing attacks and malware infections.

5. **Update policies and procedures**: Revise security policies (such as password management and incident response) and ensure all employees are aware of updated procedures.

6. **Engage law enforcement**: If necessary, report the attack to the appropriate authorities for legal and investigative support, especially if sensitive data was compromised.

7. **Cyber insurance**: If applicable, engage your cyber insurance provider to cover financial losses or legal costs incurred due to the attack.

By following these steps, you can effectively contain, resolve, recover from the incident, and strengthen your defenses against future attacks.