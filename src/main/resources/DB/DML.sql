
INSERT INTO breed 
	(breed_name)
VALUES
	('American Shorthair'),
	('Burmese'),
	('Gila Monster'),
	('Bichon Frise'),
	('Cavichon'),
	('Mustang'),
	('Appaloosa');
	
INSERT INTO animal_type 
	(type_name)
VALUES
	('dog'),
	('lizard'),
	('horse'),
	('cat');

INSERT INTO own_r 
	(usrnm, owner1_first_name, owner1_last_name, owner2_first_name, owner2_last_name, street1, street2, city, state, zip, phone1, phone2, fax, email1, email2, website)
VALUES
	('hawks','Cris', 'Hawk', 'Amy', 'Hawk', '9 Hoard Drive', '# 4529', 'Irvine', 'CA', '92619', '(949)549-9620', '(949)549-2803', '(949)549-4567', 'cris0@hawksisters.com', 'amy0@hawksisters.com', 'http://www.hawksistersanimalrescue.com'),
	('erproud', 'Ernesto', 'Proudler', 'Ratray', 'Proudler', '2569 Marcy Junction', null, 'Fairbanks', 'AK', '99790', '(907)484-5870', null, '(856)461-6639', 'fratray1@behance.net', 'fratray1@prnewswire.com', '127.86.81.131'),
	('ldlane', 'Danya', 'Shevlane', 'Lebond', 'Shevlane', '7 Darwin Drive', null, 'Tulsa', 'OK', '74126', '(918)225-6975', '(205)718-4947', null, 'nlebond2@ameblo.jp', 'nlebond2@netlog.com', '118.232.15.8'),
	('shbetz', 'Sean', 'Betz', 'Hazleton', 'Betz', '2280 Graedel Park', null, 'Washington', 'DC', '20268', '(202)248-0823', null, null, 'ahazleton3@oaic.gov.au', 'ahazleton3@indiatimes.com', '80.77.98.21'),
	('dedini', 'Dene', 'Ghidini', 'Espie', 'Ghidini', '0 Armistice Way', 'APT 64878', 'Sandy', 'UT', '84093', '(801)152-6619', '(573)615-1206', '(570)806-1686', 'oespie4@cisco.com', 'oespie4@springer.com', '227.1.150.124'),
	('fhnott', 'Fan', 'Nottram', 'Harkess', 'Nottram', '3 New Castle Street', 'STE 8', 'El Paso', 'TX', '88535', '(915)982-8138', null, null, 'charkess5@lulu.com', 'charkess5@parallels.com', '109.166.79.37'),
	('dele', 'Liz', 'De Lascy', 'Eldridge', 'De Lascy', '56 Marquette Alley', null, 'San Jose', 'CA', '95160', '(408)583-6683', '(517)363-0501', '(505)203-5657', 'veldridge6@yahoo.co.jp', 'veldridge6@wufoo.com', '173.179.249.15'),
	('dcson', 'Davy', 'Pierson', 'Coyte', 'Pierson', '64 Ronald Regan Park', '0491 CT', 'New York City', 'NY', '10125', '(212)700-3485', null, '(202)373-0086', 'jcoyte7@state.gov', 'jcoyte7@fotki.com', '219.103.34.236'),
	('mjdoc', 'Maria', 'Docker', 'Joanna', 'Docker', '859 Buell Junction', 'APT 5997', 'Charlottesville', 'VA', '22908', '(434)463-5630', '(251)269-9829', '(323)240-8963', 'jgrigoletti8@java.com', 'jgrigoletti8@bbc.co.uk', '247.61.36.31'),
	('wmbed', 'Waldon', 'Bedborough', 'Monique', 'Bedborough', '6967 Bartillon Hill', '6043 Mifflin Court', 'Glendale', 'CA', '91210', '(818)174-1173', '(318)338-3949', '(504)813-5373', 'mshoard9@blogspot.com', 'mshoard9@vk.com', '70.132.19.92');

INSERT INTO foster_info 
	(usrnm, foster1_first_name, foster1_last_name, foster2_first_name, foster2_last_name, street1, street2, city, state, zip, phone1, phone2, fax, email1, email2)
VALUES
	('stpoad', 'Shane', 'Poad', 'Timmie', 'Poad', '82 Washington Parkway', null, 'Santa Barbara', 'CA', '93111', '(805)102-0739', '(614)463-6361', null, 'tscadden0@cnet.com', 'tscadden0@nsw.gov.au'),
	('kclam', 'Kearney', 'Lambourn', 'Clarissa', 'Lambourn', '79812 Oakridge Pass', null, 'Tacoma', 'WA', '98481', '(253)913-8600', null, null, 'cgemelli1@fastcompany.com', 'cgemelli1@fc2.com'),
	('hacota', 'Henry', 'Cota', 'Angelico', 'Cota', '6 Ramsey Alley', null, 'Oklahoma City', 'OK', '73129', '(405)781-4223', null, null, 'awickens2@purevolume.com', 'awickens2@last.fm'),
	('gcgas', 'Corey', 'Gasnoll', 'Gayle', 'Gasnoll', '736 Dayton Pass', null, 'Jamaica', 'NY', '11480', '(917)148-3753', '(205)172-7542', null, 'gbenallack3@msu.edu', 'gbenallack3@wsj.com'),
	('btdunk', 'Bruis', 'Dunkinson', 'Tania', 'Dunkinson', '1111 Gale Lane', null, 'Baltimore', 'MD', '21203', '(443)810-4050', null, null, 'tumney4@amazonaws.com', 'tumney4@nymag.com'),
	('ddhows', 'Dedie', 'Hows', 'Drusie', 'Hows', '950 Crescent Oaks Street', null, 'Wichita Falls', 'TX', '76310', '(940)139-5398', null, null, 'dturbayne5@g.co', 'dturbayne5@shutterfly.com'),
	('cebreed', 'Cheslie', 'Breed', 'Ericha', 'Breed', '0 Lyons Lane', null, 'Toledo', 'OH', '43635', '(419)780-7954', '(208)135-4966', null, 'elerwill6@cmu.edu', 'elerwill6@jiathis.com'),
	('mmten', 'Michal', 'Whitten', 'Matzl', 'Whitten', '80714 Heath Drive', null, 'New York City', 'NY', '10275', '(212)585-3333', '(212)742-3386', null, 'mwhitten7@microsoft.com', 'mwhitten7@woothemes.com'),
	('lecab', 'Lucina', 'Cabrer', 'Emera', 'Cabrer', '38 Pawling Junction', null, 'North Port', 'FL', '34290', '(941)629-9679', null, null, 'ecabrer8@mac.com', 'ecabrer8@nhs.uk'),
	('mcel', 'Even', 'McLeese', 'Lise', 'McLeese', '9 Dayton Way', null, 'Odessa', 'TX', '79764', '(432)891-0163', null, null, 'lclemenza9@dot.gov', 'lclemenza9@prweb.com');

INSERT INTO gender 
	(gender_name)
VALUES
	('female'),
	('male');

INSERT INTO pet 
	(pet_name, type_id, breed_id, age_months, age_years, gender_id, adopted, owner_id, fostered, foster_id)
VALUES
	('Benyamin', 4, 1, 5, 6, 2, true, 4, false, null),
	('Ingaborg', 3, 6, 6, 14, 1, false, null, true, 4),
	('Lawrence', 3, 7, 10, 13, 2, true, 3, false, null),
	('Giordano', 1, 4, 3, 1, 2, false, null, true, 6),
	('Lombard', 3, 6, 10, 13, 2, false, null, true, 1),
	('Orelie', 4, 1, 11, 6, 1, false, null, true, 8),
	('Caryl', 1, 5, 4, 9, 1, false, null, true, 6),
	('Bernie', 4, 2, 6, 8, 2, false, null, true, 4),
	('Esme', 1, 4, 9, 1, 1, false, null, true, 2),
	('Blondie', 1, 5, 12, 11, 1, false, null, true, 9),
	('Lamond', 4, 1, 9, 5, 2, false, null, true, 3),
	('Lem', 1, 4, 5, 11, 2, true, 7, false, null),
	('Claudell', 1, 4, 5, 4, 2, true, 1, false, null),
	('Dacy', 3, 6, 9, 4, 1, true, 4, false, null),
	('Anthe', 3, 7, 11, 3, 1, true, 1, false, null),
	('Urban', 3, 6, 9, 9, 2, true, 9, false, null),
	('Ursulina', 4, 2, 11, 8, 1, false, null, true, 4),
	('Raynard', 4, 2, 8, 6, 2, false, null, true, 3),
	('Brandtr', 3, 7, 12, 12, 2, false, null, true, 10),
	('Matty', 3, 6, 8, 6, 2, false, null, true, 7),
	('Horatio', 3, 7, 1, 12, 2, false, null, true, 5),
	('Kaja', 2, 3, 11, 9, 1, false, null, true, 10),
	('Astrid', 4, 1, 2, 15, 1, true, 8, false, null),
	('Daynie', 4, 1, 8, 12, 1, false, null, true, 6),
	('Margette', 3, 6, 6, 14, 1, true, 1, false, null);

	
	
	
	
	
	
	
	
