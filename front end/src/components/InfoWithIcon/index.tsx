import { ReactNode } from "react";
import { IconContainer, InfoWIthIconContainer } from "./styles";


interface InfoWithIconProps {
    icon: ReactNode;
    text: string | ReactNode;
    iconBg: string;
}

export function InfoWithIcon({icon, text, iconBg}: InfoWithIconProps) {
    return (
        <InfoWIthIconContainer>
            <IconContainer iconBg={iconBg}>{icon}</IconContainer>
            {typeof text === "string" ? <p>{text}</p> : text}
        </InfoWIthIconContainer>
    )
}