package Fichi;

import ua.nic.Cursova.model.*;

import java.util.ArrayList;
import java.util.List;

public class HelpCode {
    public static List<String[]> helpCode(){
        String s;
        String s1;
        List<String[]> retList = new ArrayList();
        String[] ret = new String[2];
        ret[0] = "";
        ret[1] = "";
        ret[0] += ArmamentEntity.class.getDeclaredFields()[0].getName();
        s = ArmamentEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < ArmamentEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + ArmamentEntity.class.getDeclaredFields()[i].getName();
        s1 = ArmamentEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += ArmyEntity.class.getDeclaredFields()[0].getName();
        s = ArmyEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < ArmyEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + ArmyEntity.class.getDeclaredFields()[i].getName();
        s1 = ArmyEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += ArtilleryEntity.class.getDeclaredFields()[0].getName();
        s = ArtilleryEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < ArtilleryEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + ArtilleryEntity.class.getDeclaredFields()[i].getName();
        s1 = ArtilleryEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += AutomxaticweaponEntity.class.getDeclaredFields()[0].getName();
        s = AutomxaticweaponEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < AutomxaticweaponEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + AutomxaticweaponEntity.class.getDeclaredFields()[i].getName();
        s1 = AutomxaticweaponEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += AutotransportEntity.class.getDeclaredFields()[0].getName();
        s = AutotransportEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < AutotransportEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + AutotransportEntity.class.getDeclaredFields()[i].getName();
        s1 = AutotransportEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += BalisticmissileEntity.class.getDeclaredFields()[0].getName();
        s = BalisticmissileEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < BalisticmissileEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + BalisticmissileEntity.class.getDeclaredFields()[i].getName();
        s1 = BalisticmissileEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += BmpEntity.class.getDeclaredFields()[0].getName();
        s = BmpEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < BmpEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + BmpEntity.class.getDeclaredFields()[i].getName();
        s1 = BmpEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += BrigadeEntity.class.getDeclaredFields()[0].getName();
        s = BrigadeEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < BrigadeEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + BrigadeEntity.class.getDeclaredFields()[i].getName();
        s1 = BrigadeEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += BuildingEntity.class.getDeclaredFields()[0].getName();
        s = BuildingEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < BuildingEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + BuildingEntity.class.getDeclaredFields()[i].getName();
        s1 = BuildingEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += CaptainEntity.class.getDeclaredFields()[0].getName();
        s = CaptainEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < CaptainEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + CaptainEntity.class.getDeclaredFields()[i].getName();
        s1 = CaptainEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += CarbineEntity.class.getDeclaredFields()[0].getName();
        s = CarbineEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < CarbineEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + CarbineEntity.class.getDeclaredFields()[i].getName();
        s1 = CarbineEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += ColonelEntity.class.getDeclaredFields()[0].getName();
        s = ColonelEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < ColonelEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + ColonelEntity.class.getDeclaredFields()[i].getName();
        s1 = ColonelEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += CombatAndTransportVehiclesEntity.class.getDeclaredFields()[0].getName();
        s = CombatAndTransportVehiclesEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < CombatAndTransportVehiclesEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + CombatAndTransportVehiclesEntity.class.getDeclaredFields()[i].getName();
        s1 = CombatAndTransportVehiclesEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += CompositionofficersEntity.class.getDeclaredFields()[0].getName();
        s = CompositionofficersEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < CompositionofficersEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + CompositionofficersEntity.class.getDeclaredFields()[i].getName();
        s1 = CompositionofficersEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += DepartmentEntity.class.getDeclaredFields()[0].getName();
        s = DepartmentEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < DepartmentEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + DepartmentEntity.class.getDeclaredFields()[i].getName();
        s1 = DepartmentEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += DivisionEntity.class.getDeclaredFields()[0].getName();
        s = DivisionEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < DivisionEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + DivisionEntity.class.getDeclaredFields()[i].getName();
        s1 = DivisionEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += EnsignEntity.class.getDeclaredFields()[0].getName();
        s = EnsignEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < EnsignEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + EnsignEntity.class.getDeclaredFields()[i].getName();
        s1 = EnsignEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += GeneralEntity.class.getDeclaredFields()[0].getName();
        s = GeneralEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < GeneralEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + GeneralEntity.class.getDeclaredFields()[i].getName();
        s1 = GeneralEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += LieutenantEntity.class.getDeclaredFields()[0].getName();
        s = LieutenantEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < LieutenantEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + LieutenantEntity.class.getDeclaredFields()[i].getName();
        s1 = LieutenantEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += LocationEntity.class.getDeclaredFields()[0].getName();
        s = LocationEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < LocationEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + LocationEntity.class.getDeclaredFields()[i].getName();
        s1 = LocationEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += MajorEntity.class.getDeclaredFields()[0].getName();
        s = MajorEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < MajorEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + MajorEntity.class.getDeclaredFields()[i].getName();
        s1 = MajorEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += MilitarybaseEntity.class.getDeclaredFields()[0].getName();
        s = MilitarybaseEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < MilitarybaseEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + MilitarybaseEntity.class.getDeclaredFields()[i].getName();
        s1 = MilitarybaseEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += MilitaryspecialtyEntity.class.getDeclaredFields()[0].getName();
        s = MilitaryspecialtyEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < MilitaryspecialtyEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + MilitaryspecialtyEntity.class.getDeclaredFields()[i].getName();
        s1 = MilitaryspecialtyEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += OrdinaryEntity.class.getDeclaredFields()[0].getName();
        s = OrdinaryEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < OrdinaryEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + OrdinaryEntity.class.getDeclaredFields()[i].getName();
        s1 = OrdinaryEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += PersonEntity.class.getDeclaredFields()[0].getName();
        s = PersonEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < PersonEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + PersonEntity.class.getDeclaredFields()[i].getName();
        s1 = PersonEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += PettyofficerEntity.class.getDeclaredFields()[0].getName();
        s = PettyofficerEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < PettyofficerEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + PettyofficerEntity.class.getDeclaredFields()[i].getName();
        s1 = PettyofficerEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += PettyofficercolonelEntity.class.getDeclaredFields()[0].getName();
        s = PettyofficercolonelEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < PettyofficercolonelEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + PettyofficercolonelEntity.class.getDeclaredFields()[i].getName();
        s1 = PettyofficercolonelEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += PlatoonEntity.class.getDeclaredFields()[0].getName();
        s = PlatoonEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < PlatoonEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + PlatoonEntity.class.getDeclaredFields()[i].getName();
        s1 = PlatoonEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += RankandfileEntity.class.getDeclaredFields()[0].getName();
        s = RankandfileEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < RankandfileEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + RankandfileEntity.class.getDeclaredFields()[i].getName();
        s1 = RankandfileEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += RocketweaponsEntity.class.getDeclaredFields()[0].getName();
        s = RocketweaponsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < RocketweaponsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + RocketweaponsEntity.class.getDeclaredFields()[i].getName();
        s1 = RocketweaponsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += RotaEntity.class.getDeclaredFields()[0].getName();
        s = RotaEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < RotaEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + RotaEntity.class.getDeclaredFields()[i].getName();
        s1 = RotaEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += SergeantEntity.class.getDeclaredFields()[0].getName();
        s = SergeantEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < SergeantEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + SergeantEntity.class.getDeclaredFields()[i].getName();
        s1 = SergeantEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += TractorEntity.class.getDeclaredFields()[0].getName();
        s = TractorEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < TractorEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + TractorEntity.class.getDeclaredFields()[i].getName();
        s1 = TractorEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += YefreytorEntity.class.getDeclaredFields()[0].getName();
        s = YefreytorEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < YefreytorEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + YefreytorEntity.class.getDeclaredFields()[i].getName();
        s1 = YefreytorEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        return retList;
    }
}
