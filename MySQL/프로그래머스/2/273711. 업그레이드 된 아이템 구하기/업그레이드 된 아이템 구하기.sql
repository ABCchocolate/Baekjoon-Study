SELECT 
    ii.ITEM_ID, 
    ii.ITEM_NAME, 
    ii.RARITY
FROM 
    ITEM_TREE it
JOIN 
    ITEM_INFO parent_info 
    ON it.PARENT_ITEM_ID = parent_info.ITEM_ID
JOIN 
    ITEM_INFO ii 
    ON it.ITEM_ID = ii.ITEM_ID
WHERE 
    parent_info.RARITY = 'RARE'
ORDER BY 
    ii.ITEM_ID DESC;
