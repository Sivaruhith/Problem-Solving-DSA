SELECT s.user_id,
COALESCE(
    ROUND(
        AVG(
            CASE
                WHEN c.action ='confirmed' THEN 1
                WHEN c.action = 'timeout' THEN 0
            END
        ),
        2 
    ),
    0.00
)AS confirmation_rate

FROM Signups s
LEFT JOIN Confirmations c
ON s.user_id=c.user_id
GROUP BY s.user_id;