SELECT 
	p.pet_name AS name,
	a.type_name AS kind,
	b.breed_name AS breed,
	g.gender_name AS gender,
	p.age_years AS years,
	p.age_months AS months
FROM 
	pet p 
	
INNER JOIN animal_type a ON p.type_id = a.type_id 

INNER JOIN breed b ON p.breed_id = b.breed_id

INNER JOIN gender g ON p.gender_id = g.gender_id
	
WHERE p.adopted = false 

ORDER BY kind	
	
	
	